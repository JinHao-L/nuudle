package seedu.address.storage.archive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.model.util.SampleDataUtil.getSampleAppointmentBook;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalAppointments.ALICE_APPOINTMENT;
import static seedu.address.testutil.TypicalAppointments.BENSON_APPOINTMENT;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.AppointmentBook;
import seedu.address.model.ReadOnlyAppointmentBook;
import seedu.address.model.appointment.Appointment;
import seedu.address.storage.StorageStatsManager;
import seedu.address.testutil.AppointmentBuilder;

public class CsvAppointmentArchiveTest {
    private static final Path TEST_DATA_FOLDER = Paths.get("src",
            "test", "data", "CsvAppointmentArchiveTest");

    @TempDir
    public Path testFolder;

    private final Appointment expiredMay2010Appointment = new AppointmentBuilder(ALICE_APPOINTMENT)
            .withDate(LocalDate.of(2010, 5, 5)).build();
    private final Appointment expiredMay2010Appointment2 = new AppointmentBuilder(BENSON_APPOINTMENT)
            .withDate(LocalDate.of(2010, 5, 5)).build();
    private final Appointment expiredOct2010Appointment = new AppointmentBuilder(ALICE_APPOINTMENT)
            .withDate(LocalDate.of(2010, 10, 5)).build();
    private final Appointment expiredMay2009Appointment = new AppointmentBuilder(ALICE_APPOINTMENT)
            .withDate(LocalDate.of(2009, 5, 5)).build();
    private final Appointment expiredOct2009Appointment = new AppointmentBuilder(ALICE_APPOINTMENT)
            .withDate(LocalDate.of(2009, 10, 5)).build();

    @Test
    public void readAppointments_nullFilePath_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> readArchive(null));
    }

    @Test
    public void read_nonExistentCsvFile_emptyList() throws Exception {
        // returns empty list
        assertTrue(readArchive("NonExistentFile.csv").isEmpty());
    }

    @Test
    public void read_notCsvFormat_exceptionThrown() {
        assertThrows(DataConversionException.class, () -> readArchive("notCsvFormat.csv"));
    }

    @Test
    public void read_validCsvFile_returnList() throws Exception {
        assertEquals(getSampleCsvData(), readArchive("validCsvArchive.csv"));
    }

    @Test
    public void read_nullFilePath_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> readArchive(null));
    }

    @Test
    public void saveAppointments_nullAppointmentList_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> saveAppointments(null, "SomeFile.csv"));
    }

    @Test
    public void saveAppointments_nullFilePath_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> saveAppointments(getSampleCsvData(), null));
    }

    @Test
    public void saveThenReadAppointments_allInOrder_success() throws Exception {
        CsvAppointmentArchive archive = new CsvAppointmentArchive(testFolder, new StorageStatsManager());
        String fileName = "test.csv";
        List<CsvAdaptedAppointment> originalData = getSampleCsvData();

        archive.saveAppointments(originalData, fileName);
        assertEquals(originalData, archive.readAppointments(fileName));

        // continuous write - append data
        archive.saveAppointments(originalData, fileName);
        assertEquals(4, archive.readAppointments(fileName).size());
    }

    @Test
    public void archivePastAppointments_nullAppointmentBook_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> archivePastAppointments(null));
    }

    @Test
    public void archiveThenReadAppointmentBook_withOneExpiredAppointments_archiveSuccess() throws Exception {
        CsvAppointmentArchive archive = new CsvAppointmentArchive(testFolder, new StorageStatsManager());

        AppointmentBook appointmentBook = new AppointmentBook();
        appointmentBook.setAppointments(List.of(expiredMay2010Appointment, BENSON_APPOINTMENT));

        AppointmentBook expectedAppointmentBook = new AppointmentBook(appointmentBook);
        expectedAppointmentBook.removeAppointment(expiredMay2010Appointment);

        // Check if appointment book returned is correct
        ReadOnlyAppointmentBook upcomingAppointmentBook = archive.archivePastAppointments(appointmentBook);
        assertEquals(expectedAppointmentBook, upcomingAppointmentBook);

        // Check csv file
        Path archiveFile = testFolder.resolve("2010_MAY.csv");
        List<CsvAdaptedAppointment> csvData = archive.readAppointments(archiveFile);
        assertEquals(List.of(new CsvAdaptedAppointment(expiredMay2010Appointment)), csvData);
    }

    @Test
    public void archiveThenReadAppointmentBook_withMultipleExpiredAppointments_archiveSuccess() throws Exception {
        CsvAppointmentArchive archive = new CsvAppointmentArchive(testFolder, new StorageStatsManager());

        AppointmentBook appointmentBook = new AppointmentBook();
        appointmentBook.setAppointments(List.of(expiredMay2010Appointment, expiredMay2010Appointment2,
                BENSON_APPOINTMENT));

        AppointmentBook expectedAppointmentBook = new AppointmentBook(appointmentBook);
        expectedAppointmentBook.setAppointments(List.of(BENSON_APPOINTMENT));

        // Check if appointment book returned is correct
        ReadOnlyAppointmentBook upcomingAppointmentBook = archive.archivePastAppointments(appointmentBook);
        assertEquals(expectedAppointmentBook, upcomingAppointmentBook);

        // Check csv file
        Path archiveFile = testFolder.resolve("2010_MAY.csv");
        List<CsvAdaptedAppointment> csvData = archive.readAppointments(archiveFile);
        assertEquals(
                List.of(new CsvAdaptedAppointment(expiredMay2010Appointment),
                        new CsvAdaptedAppointment(expiredMay2010Appointment2)),
                csvData);
    }

    @Test
    public void archiveThenReadAppointmentBook_withExpiredAppointmentsOfDiffYears_archiveSuccess() throws Exception {
        CsvAppointmentArchive archive = new CsvAppointmentArchive(testFolder, new StorageStatsManager());

        AppointmentBook appointmentBook = new AppointmentBook();
        appointmentBook.setAppointments(List.of(expiredMay2010Appointment, expiredMay2009Appointment,
                BENSON_APPOINTMENT));

        AppointmentBook expectedAppointmentBook = new AppointmentBook();
        expectedAppointmentBook.addAppointment(BENSON_APPOINTMENT);

        // Check if appointment book returned is correct
        ReadOnlyAppointmentBook upcomingAppointmentBook = archive.archivePastAppointments(appointmentBook);
        assertEquals(expectedAppointmentBook, upcomingAppointmentBook);

        // Check may 2010 csv file
        Path archiveFile = testFolder.resolve("2010_MAY.csv");
        List<CsvAdaptedAppointment> may2010CsvData = archive.readAppointments(archiveFile);
        assertEquals(List.of(new CsvAdaptedAppointment(expiredMay2010Appointment)), may2010CsvData);

        // Check may 2009 csv file
        archiveFile = testFolder.resolve("2009_MAY.csv");
        List<CsvAdaptedAppointment> may2009CsvData = archive.readAppointments(archiveFile);
        assertEquals(List.of(new CsvAdaptedAppointment(expiredMay2009Appointment)), may2009CsvData);
    }

    @Test
    public void archiveThenReadAppointmentBook_withExpiredAppointmentsOfDiffMonths_archiveSuccess() throws Exception {
        CsvAppointmentArchive archive = new CsvAppointmentArchive(testFolder, new StorageStatsManager());

        AppointmentBook appointmentBook = new AppointmentBook();
        appointmentBook.setAppointments(List.of(expiredMay2010Appointment, expiredOct2010Appointment,
                BENSON_APPOINTMENT));

        AppointmentBook expectedAppointmentBook = new AppointmentBook();
        expectedAppointmentBook.addAppointment(BENSON_APPOINTMENT);

        // Check if appointment book returned is correct
        ReadOnlyAppointmentBook upcomingAppointmentBook = archive.archivePastAppointments(appointmentBook);
        assertEquals(expectedAppointmentBook, upcomingAppointmentBook);

        // Check may csv file
        Path archiveFile = testFolder.resolve("2010_MAY.csv");
        List<CsvAdaptedAppointment> mayCsvData = archive.readAppointments(archiveFile);
        assertEquals(List.of(new CsvAdaptedAppointment(expiredMay2010Appointment)), mayCsvData);

        // Check oct csv file
        archiveFile = testFolder.resolve("2010_OCT.csv");
        List<CsvAdaptedAppointment> octCsvData = archive.readAppointments(archiveFile);
        assertEquals(List.of(new CsvAdaptedAppointment(expiredOct2010Appointment)), octCsvData);
    }

    @Test
    public void archiveThenReadAppointmentBook_writeToExistingFile_archiveSuccess() throws Exception {
        CsvAppointmentArchive archive = new CsvAppointmentArchive(testFolder, new StorageStatsManager());

        AppointmentBook appointmentBook = new AppointmentBook();
        appointmentBook.setAppointments(List.of(expiredOct2009Appointment, BENSON_APPOINTMENT));

        AppointmentBook expectedAppointmentBook = new AppointmentBook();
        expectedAppointmentBook.addAppointment(BENSON_APPOINTMENT);

        // Check if appointment book returned is correct
        ReadOnlyAppointmentBook upcomingAppointmentBook = archive.archivePastAppointments(appointmentBook);
        assertEquals(expectedAppointmentBook, upcomingAppointmentBook);

        CsvAdaptedAppointment octCsvAppointment = new CsvAdaptedAppointment(expiredOct2009Appointment);
        // Check Oct csv file
        Path archiveFile = testFolder.resolve("2009_OCT.csv");
        List<CsvAdaptedAppointment> octCsvData = archive.readAppointments(archiveFile);
        assertEquals(List.of(octCsvAppointment), octCsvData);

        // Archive again
        archive.archivePastAppointments(appointmentBook);

        // Check oct csv file
        List<CsvAdaptedAppointment> dataFromFile = archive.readAppointments(archiveFile);
        assertEquals(List.of(octCsvAppointment, octCsvAppointment), dataFromFile);
    }
    @Test
    public void archiveAppointmentBook_emptyAppointmentBook_noSaveToTestFolder() {
        CsvAppointmentArchive archive = new CsvAppointmentArchiveStub(testFolder, new StorageStatsManager());

        AppointmentBook appointmentBook = new AppointmentBook();

        // no change in appointment book
        assertEquals(appointmentBook, archive.archivePastAppointments(appointmentBook));
    }

    @Test
    public void archiveAppointmentBook_sampleAppointmentBook_noSaveToTestFolder() {
        CsvAppointmentArchive archive = new CsvAppointmentArchiveStub(testFolder, new StorageStatsManager());

        ReadOnlyAppointmentBook appointmentBook = getSampleAppointmentBook();

        // no change in appointment book
        assertEquals(appointmentBook, archive.archivePastAppointments(appointmentBook));
    }

    private List<CsvAdaptedAppointment> getSampleCsvData() {
        return List.of(new CsvAdaptedAppointment(expiredMay2010Appointment),
                new CsvAdaptedAppointment(BENSON_APPOINTMENT));
    }

    private Path addToTestDataPathIfNotNull(String prefsFileInTestDataFolder) {
        return prefsFileInTestDataFolder != null
                ? TEST_DATA_FOLDER.resolve(prefsFileInTestDataFolder)
                : null;
    }

    private ReadOnlyAppointmentBook archivePastAppointments(ReadOnlyAppointmentBook appointmentBook) {
        return new CsvAppointmentArchive(TEST_DATA_FOLDER, new StorageStatsManager())
                .archivePastAppointments(appointmentBook);
    }

    private List<CsvAdaptedAppointment> readArchive(String fileName) throws Exception {
        return new CsvAppointmentArchive(TEST_DATA_FOLDER, new StorageStatsManager())
                .readAppointments(addToTestDataPathIfNotNull(fileName));
    }

    private void saveAppointments(List<CsvAdaptedAppointment> appointments, String fileName) {
        try {
            new CsvAppointmentArchive(TEST_DATA_FOLDER, new StorageStatsManager())
                    .saveAppointments(appointments, addToTestDataPathIfNotNull(fileName));
        } catch (IOException ioe) {
            throw new AssertionError("There should not be an error writing to the file.", ioe);
        }
    }

    /**
    * A default CsvAppointmentArchive stub that have all of the methods failing other than
    * {@code archivePastAppointments}.
    */
    private class CsvAppointmentArchiveStub extends CsvAppointmentArchive {
        public CsvAppointmentArchiveStub(Path directoryPath, StorageStatsManager statsManager) {
            super(directoryPath, statsManager);
        }

        @Override
        public Path getArchiveDirectoryPath() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public ReadOnlyAppointmentBook archivePastAppointments(ReadOnlyAppointmentBook appointmentBook) {
            return super.archivePastAppointments(appointmentBook);
        }

        @Override
        public void saveAppointments(List<CsvAdaptedAppointment> appointments, String fileName) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void saveAppointments(List<CsvAdaptedAppointment> appointments, Path filePath) throws IOException {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public List<CsvAdaptedAppointment> readAppointments(String fileName) throws DataConversionException {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public List<CsvAdaptedAppointment> readAppointments(Path filePath) throws DataConversionException {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public String getFileName(LocalDate date) {
            throw new AssertionError("This method should not be called.");
        }
    }

}
