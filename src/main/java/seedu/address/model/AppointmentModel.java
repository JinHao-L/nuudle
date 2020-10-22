package seedu.address.model;

import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.address.model.appointment.Appointment;
import seedu.address.model.patient.Patient;

/**
 * The API of the Appointment related commands in Model component.
 */
public interface AppointmentModel {
    /**
     * {@code Predicate} that always evaluate to true
     */
    Predicate<Appointment> PREDICATE_SHOW_ALL_APPOINTMENTS = unused -> true;

    /**
     * Returns true if the time slot of an appointment hasOverlaps {@code appointment} in the appointment book.
     */
    boolean hasOverlappingAppointment(Appointment appointment);

    /**
     * Returns true if the time slot of an appointment is same {@code appointment} in the appointment book.
     */
    boolean hasAppointment(Appointment appointment);

    /**
     * Adds the given appointment.
     * {@code appointment} must not already exist in the appointment book.
     */
    void addAppointment(Appointment appointment);

    /**
     * Deletes the given appointment.
     * The appointment must exist in the appointment book.
     */
    void deleteAppointment(Appointment target);

    /**
     * Updates the relevant appointments upon the editing of a given {@code target} with {@code editedPatient}.
     */
    void updateAppointmentsWithPatient(Patient target, Patient editedPatient);

    /**
     * Deletes the relevant appointments upon the deletion of a given {@code target}.
     */
    void deleteAppointmentsWithPatient(Patient target);

    /**
     * Replaces the given {@code target} with {@code editedAppointment}.
     * {@code target} must exist in the appointment book.
     * The appointment details of {@code editedAppointment} must not be the same as another existing appointment
     * in the appointment book.
     */
    void setAppointment(Appointment target, Appointment editedAppointment);

    /**
     * Updates the filter of the filtered appointment list to filter by the given {@code predicate}.
     *
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredAppointmentList(Predicate<Appointment> predicate);

    /**
     * Returns an unmodifiable view of the filtered appointment list
     */
    ObservableList<Appointment> getFilteredAppointmentList();

    /**
     * Replaces appointment book data with the data in {@code appointmentBook}.
     */
    void setAppointmentBook(ReadOnlyAppointmentBook appointmentBook);

    /**
     * Returns the AppointmentBook
     */
    ReadOnlyAppointmentBook getAppointmentBook();

}
