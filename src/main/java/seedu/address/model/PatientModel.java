package seedu.address.model;

import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.address.model.patient.Patient;

/**
 * The API of the Patient related commands in Model component.
 */
public interface PatientModel {
    /**
     * {@code Predicate} that always evaluate to true
     */
    Predicate<Patient> PREDICATE_SHOW_ALL_PATIENTS = unused -> true;

    /**
     * Replaces patient book data with the data in {@code patientBook}.
     */
    void setPatientBook(ReadOnlyPatientBook patientBook);

    /**
     * Returns the PatientBook
     */
    ReadOnlyPatientBook getPatientBook();

    /**
     * Returns true if a patient with the same identity as {@code patient} exists in the patient book.
     */
    boolean hasPatient(Patient patient);

    /**
     * Adds the given patient.
     * {@code patient} must not already exist in the patient book.
     */
    void addPatient(Patient patient);

    /**
     * Deletes the given patient.
     * The patient must exist in the patient book.
     */
    void deletePatient(Patient target);

    /**
     * Replaces the given patient {@code target} with {@code editedPatient}.
     * {@code target} must exist in the patient book.
     * The patient identity of {@code editedPatient} must not be the same as another existing patient
     * in the patient book.
     */
    void setPatient(Patient target, Patient editedPatient);

    /**
     * Returns an unmodifiable view of the filtered patient list
     */
    ObservableList<Patient> getFilteredPatientList();

    /**
     * Updates the filter of the filtered patient list to filter by the given {@code predicate}.
     *
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredPatientList(Predicate<Patient> predicate);
}
