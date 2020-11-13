---
layout: page
title: User Guide
---
![Nuudle Logo](images/nuudleLogo.png)

* Table of Contents
{:toc}

<div style="page-break-after: always;"></div>

## Introduction

`[written by: Xin Zhe]`

Welcome to Nuudle’s User Guide! :smiley:

Looking for a wonderful solution to simplify the complicated process of clinic management? Look no further!

Nuudle is a **desktop application that helps nurses manage patient records and schedule appointments** in an accurate and efficient manner.
It provides features that allows you to easily manage and keep track of the upcoming appointments in your clinic.

Nuudle is simple and user-friendly. It is optimised for use via a Command Line Interface (CLI) while still providing you with the benefits of a Graphical User Interface (GUI).
If you can type fast, Nuudle can manage your patients' appointments faster than traditional clinic management applications.

Interested? Continue reading on to explore the wonders of Nuudle and enhance the way you schedule appointments for your patients.

<div style="page-break-after: always;"></div>

## About

`[written by: Xin Zhe]`

This document provides you with all necessary information on the installation and complete usage of Nuudle. You can find comprehensive descriptions of all available features in our [Commands](#commands) section and [Quick Start](#quick-start) section will help you with setting up.

The guide also uses the following symbols and formatting:
* Words that looks like [this](#about) can be clicked to navigate you to the related section of this user guide.
* Words that looks like *this* are words related to Nuudle's GUI.
* Words that looks like `this` are words used in commands of Nuudle.
* Words that looks like <kbd>this</kbd> are keys that you can press using your keyboard

<div markdown="block" class="alert alert-info">

:information_source: This icon is used to indicate additional useful notes and information.<br>

</div>

<div markdown="block" class="alert alert-warning">

:exclamation: This icon is used to indicate important information.<br>

</div>

<div markdown="span" class="alert alert-primary">

:bulb: This icon is used to indicate useful tips of Nuudle.<br>

</div>

<div style="page-break-after: always;"></div>

## Quick Start

`[written by: Xin Zhe]`

This section provides a step-by-step guide on how to install Nuudle and get it to run on your computer. It also shows the different sections that make up Nuudle's user interface and various sample commands.

Let's get started! :smiley:

### Installing Nuudle

`[written by: Low Ming Lim]`

Follow these steps to get started:

1. Ensure you have **Java 11** or above installed on your Computer. 
    * To find out the Java version you have installed, click [here](https://www.java.com/en/download/help/version_manual.xml).
    * If Java is not installed on your computer, click [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) to download it.<br>
    
1. Proceed to Nuudle's download page [here](https://github.com/ay2021s1-cs2103t-t12-4/tp/releases).

1. Click on the link displayed in the following picture to download Nuudle's application file.
![GitHub download page](images/QuickStart.png)

1. Save the file to a folder where you want to store the Nuddle application and it's related data.
![GitHub download page](images/QuickStart2.png)

1. Double-click the Nuudle application to start Nuudle up. 
![GitHub download page](images/QuickStart3.png)

    * An application window similar to the one below should appear in a few seconds.
    Notice how Nuudle comes with sample data to get you started.<br>
    ![Ui](images/Ui.png)
1. Congratulations! Nuudle is now ready for your perusal :smiley:

<div style="page-break-after: always;"></div>

### Using Nuudle

`[written by: Lim Jin Hao]`

This section will walk you through the layout of Nuudle. 


![UiMarkUp](images/UiMarkup.png)

The layout of Nuudle can be divided into 2 main areas:
1. The command execution area
2. The main viewing area

<div style="page-break-after: always;"></div>

#### Executing commands

`[written by: Lim Jin Hao]`

The command execution area consists of the *Command Box* and the *Result Display Box*.

The *Command Box* is the area where you can type in your command and subsequently execute it by pressing <kbd>Enter</kbd>.
The result from the execution will then be displayed in the *Result Display Box*.

To get you started, here are some sample commands that you can try out:

1. **`help`** : Shows the help window.

1. **`list`** : Lists all patients.

1. **`add`**` n/John Doe i/S9730284G p/98765432 a/John street, block 123, #01-01` : Adds a patient named `John Doe` to the patient book.

1. **`assign`**` 1 d/Tomorrow t/8.30am dur/30` : Creates an appointment for the 1st patient in the patient list for tomorrow 8.30am to 9am, assuming that the time slot is free.

1. **`view`**` d/Tomorrow` : Displays all appointment happening tomorrow.

1. **`cancel`**` 1` : Cancels the first appointment in the displayed appointment list.

1. **`clear`** : Deletes all patients and appointments.

1. **`exit`** : Exits the app.

To learn more about the various commands used in Nuudle, head down to our [Commands](#commands) section.

Alternatively, you can visit our [Command Summary](#command-summary) section to get a quick overview of Nuudle's commands.

<div style="page-break-after: always;"></div>

#### Viewing data

`[written by: Lim Jin Hao]`

The main viewing area consists of the *Patient Book*, the *Appointment Book* and the *Appointment Overview*.

* The *Patient Book* contains information about the patients stored in Nuudle. Here we take a look at an entry in the Patient Book.
  ![PatientCard](images/PatientCard.png)
  
  * The *Patient Index* is a numbering system used in the Patient Book, which allows you to easily reference the patient by using the index shown.
  Throughout the document and the application, we use the term `PATIENT_INDEX` to refer to this numbering.

  * The *Medical Condition* here is a tag that help nurses easily identify any identified allergy, illness and more.
  This medical condition can be added as a tag when [adding a new patient](#adding-a-patient--add) or by [editing an existing patient](#editing-a-patient--edit).

  * The *Patient Details* are neatly displayed at the bottom for you to easily check and identify a patient.

* The *Appointment Book* contains details about the appointments created by Nuudle. Here we take a look at a single entry in the Appointment Book 
![AppointmentCard](images/AppointmentCard.png)

  <div style="page-break-after: always;"></div>

  * Similar to the Patient Index, the *Appointment Index* is a numbering system used in the Appointment Book.
  We use the term `APPT_INDEX` to refer to this numbering.

  * Another important part of an appointment is the *Appointment Status*. There are four status types used in Nuudle and the meaning of each status is shown in the table below:

  **Appointment Status** | **Meaning**
  :---------------:|:----------------
  ![StatusDone](images/StatusDone.png) | A completed appointment that has been marked as done using the `done` command
  ![StatusUpcoming](images/StatusUpcoming.png) | An uncompleted appointment that will be happening in the future.
  ![StatusOngoing](images/StatusOngoing.png) | An appointment that is currently ongoing but is still uncompleted.
  ![StatusExpired](images/StatusExpired.png) | An appointment that has already passed but is still uncompleted.

  * The *Patient Details* in the appointment entry provides the basic information of the patient, namely the name and the contact number.
  This allows you to easily keep track of who will be coming for the appointment and also call up the patient, if necessary.

* Lastly, the *Appointment Overview* provides simple statistics about the appointments stored in Nuudle.

  ![AppointmentOverview](images/AppointmentOverview.png)
  
  With it, you can: 
  * keep track of the total number of expected appointments for the day.
  * stay updated on the remaining number of appointments to be completed for the day.
  * get an estimate on how busy the clinic will be for the rest of the week.

<div style="page-break-after: always;"></div>

## Commands

`[written by: Zhang Wanlin]`

The command is the main way to schedule appointment for a patient with Nuudle.

This section introduces three types of commands:
1. [General](#general)
2. [Patient Management](#patient-management)
3. [Appointment Management](#appointment-management)
 
An overview of all the commands is also provided in the [Command Summary](#command-summary).

### Command format

This section emphasises on the common format across all command input.


<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

`[written by: Zhang Wanlin]`

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g `n/NAME [t/TAG]` can be used as `n/John Doe t/hypertension` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

</div>

<div markdown="block" class="alert alert-warning">

**:exclamation: Important information about the command parameters**<br>

`[written by: Low Ming Lim]`

* `DATE`
    * Please use the prefix `d/` when indicating a `DATE` value and prefix `t/` when indicating a `TIME` value in your user input.
    * Please note that the `DATE` and `TIME` used for scheduling an appointment must be set in the future.
    * The `DATE and `TIME` can be written using various commonly used formats or even using natural language.
    The table below provides a brief summary of the supported formats and languages:

    <div markdown="block" style="background-color: #f8f9fa; position: center" >
    
    Formatted Date | Natural Date | Formatted Time | Natural Time
    :---------------:|:----------------:|:----------------:|:----------------:
    02/12/2020 | Today | 2300 | Morning (8AM)
    02-12-2020 | Tomorrow | 11:00PM | Noon (12PM)
    12/02/2020 | Monday | 11.00PM | Evening (7PM)
    12-02-2020 | Tuesday | 11PM | Night (10PM)
    2020/12/02 | Wednesday |
    2020-12-02 | Thursday |
    2-Dec-2020 | Friday |
    2 Dec 2020 | Saturday |
    2-December-2020 | Sunday |
    2 December 2020 |
    
    </div>

    * For all date formats, the year can be omitted if it is the same as the current year.
    * The day of the week will correspond to the nearest upcoming day of the week from the current date.

* `APPT_INDEX` & `PATIENT_INDEX`
    * Unlike `DATE` and `TIME`, we do not require users to enter a prefix before the `INDEX` value.
    * Please note that the index used **must be a positive integer**. For example, valid index values include 1, 2, 3, etc …
    * The `APPT_INDEX` refers to the number shown in the displayed appointment book located on the right side of the UI.
    ![Appointment Index](images/CommandFormatAppt.png)
    * The `PATIENT_INDEX` refers to the number shown in the displayed patient book located on the left side of the UI.
    ![Patient Index](images/CommandFormatPatient.png)

* `DURATION`
    * We measure our `DURATION` inputs in minutes. For example, to enter a `DURATION` of 1 hour, kindly use `dur/60` as the input value.
    * The `DURATION` of an appointment must be a positive integer that is greater than or equal to 10 minutes.
    * To provide you with a better user experience, we decided to display the time range of an appointment calculated by adding the `DURATION` you entered to the starting `TIME` of the appointment.<br>
    ![Duration Display](images/CommandFormatDuration.png)


</div>

<div style="page-break-after: always;"></div>

### General

#### Viewing help : `help`

`[written by: Lim Jin Hao]`

Opens a new window which shows the commonly used commands, and a link to access the User Guide.

![Help Message](images/helpMessage.png)

Format: `help`

<div style="page-break-after: always;"></div>

#### Undoing previous command : `undo`

`[written by: Yang Yue]`

Restores the patient and appointment book to the state before the previous *undoable* command was executed.
`undo` command cannot reverse a command execution from the previous Nuudle session.
 
Format: `undo`

<div markdown="span" class="alert alert-primary">:information_source: **Tip:**
Undoable commands refers to commands that modifies the patient or appointment list contents. (**add**, **edit**, **delete**, **remark**, **assign**, **change**, **cancel**, **done** and **clear**)
</div>

* There must be at least one previously executed undoable command.
* Multiple calls to `undo` will reverse multiple undoable command execution, starting from the most recent command.

Examples:
* `delete 1`<br>
  `list`<br>
  `undo` (reverses the `delete 1` command)

* `view d/today`<br>
  `list`<br>
  `undo`<br>
   The `undo` command fails as there is no previous undoable command to reverse.

* `cancel 1`<br>
  `clear`<br>
  `undo` (reverses the `clear` command)<br>
  `undo` (reverses the `cancel 1` command)

<div style="page-break-after: always;"></div>

Step-by-step illustration:
1. Initial state: <br>
![UndoCommandInitialState](images/UndoRedoInitialState_UG.png)

2. Input `delete 1`: <br>
![UndoCommandStep2](images/UndoStep2_UG.png) <br>
The first patient `Alex Yeoh` is deleted.

3. Input `undo`: <br>
![UndoCommandStep3](images/UndoStep3_UG.png) <br>
The `undo` command cancels the last undoable command `delete 1`, so that 
the patient `Alex Yeoh` comes back to the list again.

<div style="page-break-after: always;"></div>

#### Redoing the previously undone command : `redo`

`[written by: Yang Yue]`

Reverses the most recent `undo` command. `redo` command cannot reverse an `undo` execution from the previous Nuudle session.

Format: `redo`

* There must be at least one previously executed `undo` command.
* The previously executed `undo` command should be the most recent command that modifies the lists' data.
* Multiple call to `redo` will reverse multiple `undo` command, starting from the most recent `undo` command.

Examples:
* `cancel 1` <br>
  `undo` (reverses the `cancel 1` command)<br>
  `list`<br>
  `redo` (reapplies the `cancel 1` command)

* `cancel 1`<br>
  `undo` (reverses the `cancel 1` command)<br>
  `cancel 2`<br>
  `redo`<br>
   The `redo` command fails as there are no `undo` commands executed previously.

* `cancel 1`<br>
  `clear`<br>
  `undo` (reverses the `clear` command)<br>
  `undo` (reverses the `cancel 1` command)<br>
  `redo` (reapplies the `cancel 1` command)<br>
  `redo` (reapplies the `clear` command)

<div style="page-break-after: always;"></div>

Step-by-step illustration:
1. Initial state: <br>
![RedoCommandInitialState](images/UndoRedoInitialState_UG.png)

2. Input `clear`: <br>
![RedoCommandStep2](images/RedoStep2_UG.png)

  <div style="page-break-after: always;"></div>

{:start="3"}
3. Input `Undo`: <br>
![RedoCommandStep3](images/RedoStep3_UG.png) <br>
All the data comes back.

  <div style="page-break-after: always;"></div>

{:start="4"}
4. Input `Redo`: <br>
![RedoCommandStep4](images/RedoStep4_UG.png) <br>
Redo the `clear` command, which removes all the data again.

<div style="page-break-after: always;"></div>

#### Clearing all data : `clear`

`[written by: Lim Jin Hao]`

Clears all appointment and patients entries.

Format: `clear`

Step-by-step illustration:<br>
1. Suppose you would like to clear the sample data to officially start using Nuudle from scratch, you can simply type in the command `clear` and press <kbd>Enter</kbd>.<br>
![ClearBefore](images/ClearCommand1.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. As shown below, all patient and appointment entries are cleared. You can now officially start adding your clinic's patient and appointment entries.<br>
![ClearAfter](images/ClearCommand2.png)

<div style="page-break-after: always;"></div>

#### Exiting the program : `exit`

Exits Nuudle.

Format: `exit`

#### Retrieving previously entered commands

`[written by: Lim Jin Hao]`

By pressing the <kbd>↑</kbd> and <kbd>↓</kbd> arrow keys in the *command box*, you can cycle through the previously executed commands.

<div markdown="span" class="alert alert-primary">

:bulb: **Tip:** This feature can be used together with `undo` to correct a wrongly executed command.<br>

<br>
The steps below illustrate how this correction can be done:<br>

1. Use the `undo` command to first reverse the previous command execution.<br>

2. Next, use the <kbd>↑</kbd> arrow key in the *command box* to retrieve the original command.<br>

3. You can then edit the original command and execute it by pressing the <kbd>Enter</kbd> key.<br>

<br>
With this feature, it saves you the hassle of having to retype the whole command again!
</div>

#### Saving the data

`[written by: Lim Jin Hao]`

Nuudle automatically saves the patient and appointment data to your home folder after any changes are made to the data. There is no need for you to save manually.

#### Archiving past appointments

`[written by: Lim Jin Hao]`

Nuudle automatically removes past appointments and saves them into an archive folder for your future reference. This is done automatically everytime you start up the Nuudle app.

The appointments are grouped by their appointment months and saved in respective Comma-Separated Values (CSV) files. These files can be opened and viewed using Excel.

#### Backing up the data

`[written by: Lim Jin Hao]`

Nuudle also keeps a backup of your data files from the previous Nuudle session in a backup folder. The backup data will be updated everytime you start up the Nuudle app.

This backup allows you to completely revert your data to the previous session's data. This is especially useful if your data was unintentionally corrupted and you need to manually restore the data.

<div style="page-break-after: always;"></div>

### Patient Management

#### Adding a patient : `add`

`[written by: Xin Zhe]`

Adds a patient to the patient book.

Format: `add n/NAME i/NRIC p/PHONE_NUMBER a/ADDRESS [r/REMARK] [t/TAG]…​`

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
Tags are used to indicate a patient's underlying medical conditions. A patient can have any number of tags (including 0).
</div>
* Adds a patient with the specified details.
* The following fields are compulsory and must be provided: `NAME, NRIC, PHONE_NUMBER, ADDRESS`.
* It is optional to add `TAG`s for the patient. Tags can still be added with the edit command upon creating the patient entry in Nuudle.

Examples:
* `add n/John Doe i/S9730284G p/98765432 a/John street, block 123, #01-01`
* `add n/Betsy Crowe i/S9123456G t/friend a/NUS Utown p/1234567 t/asthma`

<div style="page-break-after: always;"></div>

Step-by-step illustration:
1. Enter `add n/Nuudle Numberone i/S7564832U p/84729741 a/UTown r/first visit` in the *command box*.<br>
![AddCommand1](images/AddCommand1.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. The information of the added patient is displayed in the *result display box*.
The patient is now added to the patient book.<br>
![AddCommand2](images/AddCommand2.png)

<div style="page-break-after: always;"></div>

#### Editing a patient : `edit`

`[written by: Lim Jin Hao]`

Edits a patient's particulars. Existing appointments involving the edited patient will be updated accordingly.

Format: `edit PATIENT_INDEX [n/NAME] [i/NRIC] [p/PHONE_NUMBER] [a/ADDRESS] [r/REMARK] [t/TAG]…​`

* Edits the patient at the specified `PATIENT_INDEX`.
* At least one of the optional fields must be provided to execute the edit command.
* The patient's existing particulars will be updated according to the input values.
* When editing tags, the existing tags of the patient will be removed i.e adding of tags is not cumulative.
* You can remove all the patients' tags by typing `t/` without specifying any tags after it.

Examples:
*  `edit 1 p/91234567 a/College Avenue 8` Edits the phone number and email address of the 1st patient to be `91234567` and `College Avenue 8` respectively.
*  `edit 2 n/Betsy Crower t/` Edits the name of the 2nd patient to be `Betsy Crower` and deletes all existing tags.

<div style="page-break-after: always;"></div>

Step-by-step illustration:<br>
1. Suppose you want to update Charlotte's phone number from `84812305` to `91234567`. To do this you can simply type `edit 3 p/91234567` in the *command box* and press <kbd>Enter</kbd>.<br>
![EditCommand1](images/EditCommand1.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. As shown below, Charlotte's phone number is now updated and the change is also reflected in the relevant appointments.
The particulars of the edited patient is displayed in the *result display box*.<br>
![EditCommand2](images/EditCommand2.png)

<div style="page-break-after: always;"></div>

#### Deleting a patient : `delete`

`[written by: Low Ming Lim]`

Deletes a patient from the patient book.

Format: `delete PATIENT_INDEX`

* Deletes the patient at the specified `PATIENT_INDEX`.
* Please click [here](#command-format) for important formatting information regarding the `PATIENT_INDEX` field.
* Do note that deleting a patient will also delete all corresponding appointments belonging to that patient.

Examples:
* `delete 2` <br>Deletes the 2nd patient displayed in the patient book.
* Calling `find Betsy` followed by `delete 1` deletes the 1st patient displayed in the resulting patient book of the `find` command.

<div style="page-break-after: always;"></div>

Step-by-step illustration:
1. Suppose you want to delete Alex, which is currently at the top of the patient book, from your database.<br>Simply enter `delete 1` in the *command box* and press <kbd>Enter</kbd>.<br>
![DeleteCommand](images/DeleteCommand.png)

1. Alex is now deleted from the database and the patient book is updated accordingly. 
![DeleteCommand](images/DeleteCommand2.png)


<div style="page-break-after: always;"></div>

#### Adding a remark to a patient: `remark`

`[written by: Low Ming Lim]`

Looking to add additional data unique to your patient besides the basic fields? Look no further. Use this command to add or delete a remark to an existing patient.

Format: `remark PATIENT_INDEX [r/REMARK]`

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
<br> Alternatively, you can use the edit command to add or edit remarks if you wish to change multiple fields (eg. Phone number) at the same time.
</div><br>

* **Adds a remark** for the patient at the specified `PATIENT_INDEX`.
* Please click [here](#command-format) for important formatting information for the `PATIENT_INDEX` field.
* A remark is an **optional field** and can be left blank if you wish to delete the existing `REMARK`.
* A patient will have `NIL` displayed as his/her remark status if it was left empty.
* To **override** a remark, simply use the remark command as described above.
* If you wish to **delete** a patient's remark, simply use either of the following commands:
    * `remark PATIENT_INDEX`
    * `remark PATIENT_INDEX r/`

Examples to add remark:
*  `remark 2 r/Has been visiting Dr John` <br>Adds a remark `Has been visiting Dr John` to the patient currently displayed second from the top in the patient list.
*  `remark 1 r/Can only converse in mandarin` <br>Adds a remark `Can only converse in mandarin` to the patient currently displayed at the top of the patient list.

<div style="page-break-after: always;"></div>

Step-by-step illustration for adding a remark:
1. Suppose you want to add additional information for your regular patient, Bernice, by indicating her preferred dentist.
<br>Simply enter `remark 2 r/Has been visiting Dr John` in the *command box* and press <kbd>Enter</kbd>.<br>
![Command for 'Add remark'](images/addRemark.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
1. Bernice’s remark is now updated and the particulars of the added remark is displayed in the *result display box*.
![Result for 'Add remark'](images/AddRemark2.png)

<div style="page-break-after: always;"></div>

Examples to delete the remark for a patient at index 1:

* `remark 1 r/`
* `remark 1`

Step-by-step illustration for deleting a remark:

1. Suppose you want to delete the remark data for Bernice, simply enter `remark 2` in the *command box* and press <kbd>Enter</kbd>.<br>
![Command for 'Delete remark'](images/DeleteRemark.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
1. Bernice’s remark is now deleted and the particulars of the deleted remark is displayed in the *result display box*.<br>
![Result for 'Delete remark'](images/DeleteRemark2.png)
<br>

<div style="page-break-after: always;"></div>

#### Listing all patients : `list`

`[written by: Low Ming Lim]`

If you like to reset the displayed patient or appointment book to it's original state after using a command like `find` or `view`, use this command to display the full list of all patients and appointments in NUUDLE.

Format: `list`

Step-by-step illustration:
1. Suppose you used the `find` command previously to locate appointments that belonged to a patient, Alex, and now wish to reset the displayed lists to their original states, simply type `list` in the *command box* and press <kbd>Enter</kbd>.<br>
![ListCommand](images/ListCommand.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. Both the appointment and patient books are updated to display all patient and appointment data.
![ListCommand](images/ListCommand2.png)

<div style="page-break-after: always;"></div>

#### Locating patients by name, NRIC or phone number : `find`

`[written by: Zhang Wanlin]`

Finds patients by name, NRIC or phone numbers.

Format: `find [n/NAME [MORE_NAMES]] [i/NRIC [MORE_NRICS]] [p/PHONE_NUMBER [MORE_PHONE_NUMBERS]] `

* The search is case-insensitive. e.g `hans` will match `Hans`
* The order of the keywords does not matter. e.g. `Hans Bo` will match `Bo Hans`
* Only the name, NRIC, and phone number are searched.
* Only full words will be matched e.g. `Han` will not match `Hans`
* Patients matching at least one keyword will be returned (i.e. `OR` search).
  e.g. `Hans Bo` will return `Hans Gruber`, `Bo Yang`
* The respective appointments of patients matching at least one keyword will also be returned.
* The search requirements cannot be left empty, at least one search requirement (by name, NRIC, or phone number) has to be provided

Examples:
* `find n/John` returns patients whose name contains `john`.
* `find n/alex p/99998888 i/S1234567I` returns patients whose name contains `Alex`, or whose phone number is `99998888`, or whose NRIC number is `S1234567I`.<br>

<div style="page-break-after: always;"></div>

Step-by-step illustration:<br>
Suppose you want to find a patient named as `alex` or with a phone number of `99998888`, or with NRIC number of `S1234567I`, you can:
1. Enter `find n/alex p/99998888 i/S1234567I`.<br>
![FindCommand1](images/Find1.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. The number of patients found and the number of appointments of these patients are displayed in the *result display box*, and the corresponding patient and appointment details are displayed in the patient and appointment book respectively.<br>
![FindCommand2](images/Find2.png)

<div style="page-break-after: always;"></div>

### Appointment Management

#### Adding an appointment : `assign`

`[written by: Zhang Wanlin]`

Assigns the specified patient into the specified appointment date and time.

Format: `assign PATIENT_INDEX d/DATE t/TIME [dur/DURATION]`

* Puts the patient at the specified `PATIENT_INDEX` into an appointment time slot.
* The `PATIENT_INDEX` refers to the index number indicated in the patient list.
* The `PATIENT_INDEX` **must be a positive integer** 1, 2, 3, …​
* The `DATE` and `TIME` of the appointment must be included.
* The `DURATION` is measured in minutes and will be defaulted to 60 minutes if omitted.
* The time slot indicated by `DATE` and `TIME` must be available.
* The specified `DATE` and `TIME` must be in the future.

Examples:
* `assign 1 d/Sunday t/2pm dur/40` books an appointment of 40 minutes on the upcoming Sunday, 2am for the 1st patient in the list.
* `assign 3 d/02-03-2021 t/1130` books an appointment of 60 minutes on 02/03/2021, 11:30am for the 3rd patient in the list.

<div style="page-break-after: always;"></div>

Step-by-step illustration:<br>
Suppose `Alex Yeoh`, the first patient in the list calls to book an appointment on `02 Jan 2021` at `1130`, you can:
1. Enter `assign 1 d/02 Jan 2021 t/1130` in the *command box*.<br>
![AssignCommand1](images/Assign1.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. The information of the added appointment is displayed in the *result display box.*<br>
![AssignCommand2](images/Assign2.png)

<div style="page-break-after: always;"></div>

#### Reschedules an existing appointment: `change`

`[written by: Low Ming Lim]`

If a patient wish to change his/her appointment details, you can use this command to assist you. It helps you to reschedule or modify an existing appointment with a new date, time or duration.

Do note that duration is **measured in minutes** and must be **at least 10 minutes long**!

Format: `change APPT_INDEX [d/DATE] [t/TIME] [dur/DURATION]`

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
<br>If you would only like to change the duration of an appointment while keeping it's original date and time, simply
enter the new `DURATION` with it's corresponding `APPT_INDEX`! There is no need to retype it's date and time. The same
applies for the other fields.
</div>

* **Reschedules an appointment** at the specified `APPT_INDEX` for the patient it is tagged to.
* Please click [here](#command-format) to refer to important formatting information for the `DATE`, `TIME` and `DURATION` fields.
* **At least one** optional field must be provided to successfully execute the change command.

* Appointment details will be updated according to the fields present in the user input. For fields that are absent, the appointment's original data will be used.


Examples:
*  `change 3 d/02-03-2021` <br> Reschedules the 3rd appointment displayed in the appointment book to 2nd March 2021 with it's original time, duration and patient.
*  `change 2 d/12-05-2021 t/1530 dur/60` <br> Reschedules the 2nd appointment displayed in the appointment book to 12th May 2021, 3:30PM with a duration of 1 hour for it's original patient.

* If you wish to **modify** the duration of an existing appointment, simply call the command in the following format:
    * `change 1 dur/NEW_DURATION`: <br>Extends the duration of the first appointment at `APPT_INDEX` 1 to the `NEW_DURATION` with the same date and start time.

<div style="page-break-after: always;"></div>
  
Step-by-step illustration:
<br>Example 1: Changing date
1. Suppose a patient, Charlotte, wants to reschedule her appointment to the following day at the same time. <br>Simply type 
`change 1 d/tomorrow` in the *command box* and press <kbd>Enter</kbd>.<br>
![Change Command Date Example](images/ChangeCommandDate.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
1. Charlotte's original appointment on the 9th of November, 3-4pm is now successfully rescheduled to 10th November at the same time.
 ![Change Command Date result](images/ChangeCommandDate2.png)

<div style="page-break-after: always;"></div>

<br>Example 2: Changing time and duration
1. Suppose the nurse received updates from the dentist and is now required to increase the duration of Charlotte's appointment to 1.5 hours
and as a result, has to push her appointment time-slot back to 7pm.
<br>Simply enter `change 4 t/1900 dur/90` in the *command box* and press <kbd>Enter</kbd>.<br>
 ![Change Command Date result](images/ChangeCommandTime.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
1. Charlotte's appointment is now shifted to 7pm with a new duration of 1.5 hour, thus resulting in a new end time at 8:30pm. 
 ![Change Command Date result](images/ChangeCommandTime2.png)

* Any other optional field combinations are supported as well.

<div style="page-break-after: always;"></div>

#### Canceling an appointment : `cancel`

`[written by: Lim Jin Hao]`

Cancels the specified appointment and removes it from the appointment book.

Format `cancel APPT_INDEX`

Example:
* `view` followed by `cancel 2` deletes the 2nd appointment in the displayed appointment list.
* `view d/today` followed by `cancel 1` deletes the 1st appointment happening on today's date (if it exists).

Step-by-step illustration:<br>
1. Suppose a patient calls to cancel his 10.30am appointment tomorrow, first get all the appointments for tomorrow by using the `view t/tomorrow` command.<br>
![CancelCommand1](images/CancelCommand1.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. Next, look for the 10.30am appointment and cancel it using the `cancel` command.
Here, we use `cancel 1` as the appointment to cancel is the first appointment in the book.<br>
![CancelCommand2](images/CancelCommand2.png)

  <div style="page-break-after: always;"></div>

{:start="3"}
3. The 10.30am appointment is cancelled and removed from the appointment book.
The cancelled appointment details is also displayed in the *result display box*.<br>
![CancelCommand3](images/CancelCommand3.png)


<div style="page-break-after: always;"></div>

#### Marking an appointment as done : `done`

`[written by: Yang Yue]`

Marks a specific appointment in the patient book as done.

Format: `done APPT_INDEX`

* Marks the appointment at the specified `APPT_INDEX` as done.
* The `APPT_INDEX` refers to the index number indicated in the displayed appointment list.
* The `APPT_INDEX` **must be a positive integer** 1, 2, 3, …​
* The indicated appointment should be an appointment that has not been marked before.

Example:
* `done 3` marks the 3rd appointment in the displayed appointment list as completed.
* `view d/today` followed by `done 1` marks the 4th appointment happening on today's date as completed.

Step-by-step illustration:
1. Enter `done 1` in the *command box* <br>
![DoneCommand1](images/DoneCommand1.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. The *result display box* shows the success message and the appointment is marked as down <br>
![DoneCommand2](images/DoneCommand2.png)

<div style="page-break-after: always;"></div>

#### Listing upcoming appointments by date : `view`

`[written by: Zhang Wanlin]`

Shows a list of all upcoming appointments entries or only the list of upcoming appointments happening on the specified date.

Format `view [d/DATE]`

* Outputs the list of all upcoming appointments happening on the specified date in chronological order.
* The specified `DATE` must be in the future.
* If `DATE` is not specified, `view` will output the list of **all** upcoming appointments in chronological order.

Example:
* `view` shows the list of all upcoming appointments in chronological order.
* `view d/4-Aug-2020` shows the list of appointments happening on 04/08/2020.

Step-by-step illustration:<br>
Suppose you want to check all the appointments on `05 nov 2021`, you can:
1. Enter `view d/05 Nov 2021`.<br>
![ViewCommand1](images/View1.png)

  <div style="page-break-after: always;"></div>

{:start="2"}
2. The number of appointments on that date are displayed in the *result display box* and the appointment details are displayed in the appointment book.<br>
![ViewCommand2](images/View2.png)

<div style="page-break-after: always;"></div>

#### Listing available time slots by date : `avail`

`[written by: Xin Zhe]`

Shows a list of all available (free) time slots within the operation time of the clinic on a specified date. 
The earliest available time slot on the specified date is also provided.

Format: `avail d/DATE`

* Outputs the list of all available time slots within the operation time of the clinic on a specified date in chronological order.
* The earliest available time slot within the operation time of the clinic on a specified date will also be displayed.
* `DATE` must be today or in the future.
* Do note that the earliest available time slot will not be provided when `avail d/today` is executed after clinic's operation hour.

Example:
* `avail d/4-Aug-2020` shows the list of all available (free) time slots within the operation time of the clinic on 04/08/2020.
* `avail d/today` shows the list of all available (free) time slots within the operation time of the clinic today.

<div style="page-break-after: always;"></div>

Step-by-step illustration:
1. Enter `avail d/05-Nov-2021` in the *command box*.<br>
![AvailCommand1](images/AvailCommand1.png)

2. The available time slots of the day and the earliest available time slot is displayed in the *result display box*.
The list of appointments on the specified date is also displayed.<br>
![AvailCommand2](images/AvailCommand2.png)

<div style="page-break-after: always;"></div>

### Command Summary

`[written by: Yang Yue]`

#### General

Action | Format
-------|----------
**Help** | `help`
**Undo** | `undo`
**Redo** | `redo`
**Clear** | `clear`
**Exit** | `exit`

#### Patient Management

Action | Format | Examples
--------|--------|----------
**Add** | `add n/NAME i/NRIC p/PHONE_NUMBER a/ADDRESS [t/TAG]…​` | `add n/James Ho i/S9712345G p/22224444 a/123, Clementi Rd, 1234665 t/asthma t/`
**Edit** | `edit PATIENT_INDEX [n/NAME] [i/NRIC] [p/PHONE_NUMBER] [a/ADDRESS] [r/REMARK] [t/TAG]…`|`edit 2 n/James Lee a/College Avenue 8`
**Delete** | `delete PATIENT_INDEX`| `delete 3`
**Remark** | `remark PATIENT_INDEX [r/REMARK]`| `remark 2 r/Has been visiting Dr John`, `remark 2`
**List** | `list` | `list`
**Find** | `find [n/NAME [MORE_NAMES]] [i/NRIC [MORE_NRICS]] [p/PHONE_NUMBER [MORE_PHONE_NUMBERS]]`| `find n/James Jake i/S9124632H S9812567H`

#### Appointment Management

Action | Format | Examples
--------|---------|---------
**Assign** | `assign PATIENT_INDEX d/DATE t/TIME [dur/DURATION]`| `assign 3 d/tomorrow t/3pm`
**Change** | `change APPT_INDEX [d/DATE] [t/TIME] [dur/DURATION]` | `change 3 d/02-03-2021 t/1130 dur/30`
**Cancel** | `cancel APPT_INDEX`| `cancel 1`
**Done** | `done APPT_INDEX`| `done 2`
**View** | `view [d/DATE]`| `view d/today`
**Available** | `avail d/DATE`| `avail d/12-Apr-2021`

<div style="page-break-after: always;"></div>

## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the application in the other computer and overwrite the empty data folder it creates with the data folder from your previous Nuudle's home folder.

**Q**: What are the acceptable date time format?<br>
**A**: Nuudle supports multiple date time formats as well as natural date time language. The details can be found [here](#command-format)

**Q**: My data was accidentally deleted and I can't undo it. How do I restore my data?<br>
**A**: You can restore the data from your previous session by following the steps below:
1. Look for a backup file in the data folder of your Nuudle's home folder. 
2. Open the backup file and copy the 2 data files inside.
3. Navigate back to the main data folder in your Nuudle's home folder.
4. Override the current data files in the main data folder by pasting the previously copied files.
5. The previous session's data is now restored and you can access it by starting up the Nuudle application.

<div style="page-break-after: always;"></div>

## Glossary

`[written by: Zhang Wanlin]`

This glossary provides definitions for the special terms used in the user guide.

**Index:** The number on the left side of the corresponding entry in the patient or appointment book.

**Tag:** A word or phrase that indicates the medical condition of a patient.

**GUI:** An acronym that stands for Graphic User Interface.

**CLI:** An acronym that stands for Command Line Interface.

**Command:** The text typed in by the user as an instruction for Nuudle.

**Case-insensitive:** The treatment of uppercase and lowercase letters in the same way.

**Patient book:** A list that contains all the patients.

**Appointment book**: A list that contains all the appointments of the patients.

**Operating Hours**: The working period of the clinic. This is set from 8:00am to 10:00pm by default.

