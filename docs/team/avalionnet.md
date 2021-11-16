---
layout: page
title: Low Ming Lim's Project Portfolio Page
---

## Project: Nuudle

Nuudle is a **desktop app that helps nurses manage patient records and schedule appointments** in an accurate and efficient manner.
It is optimised for use via a Command Line Interface (CLI), and has a Graphical User Interface (GUI) built with JavaFX.

It is written in Java, and has about 20 kLoC, of which I contributed about 2.8 kLoC.

Given below are my contributions to the project.

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=avalionnet&sort=groupTitle&sortWithin=title&since=2020-08-14&until=2020-11-09&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=Avalionnet&tabRepo=AY2021S1-CS2103T-T12-4%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code)

* **New Feature**: <br>Added the ability to add remarks for patients. ([\#96](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/96))
  
  * **What it does**: <br>This feature allows our users to add or delete remarks for patients via the remark command. The remarks added will be tagged to a patient and displayed on our GUI for ease of access.
  
  * **Justification**: <br>By providing our users with the option to store additional data for each patient beside the basic fields required such as NRIC and name, we can potentially increase the utility of our application as other key information
  can now be stored. For instance, the nurse can now save specific preferences of their patients, such as their preferred doctor or choice of language so as to deliver a more unique experience for their patients. This also facilitate a better customer experience for their business, giving them the competitive edge. 
  
  * **Highlights**: <br>This implementation requires a strong understanding of AB3 and careful integration of code to prevent and avoid regression errors.

* **New Feature**: <br>Added the ability to reschedule appointments. ([\#114](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/114))
  
  * **What it does**: <br>This feature makes rescheduling an appointment a breeze via the change command. Users can now change and modify an appointment's date, time and duration with ease without the need to delete and create an appointment from scratch. 
  
  * **Justification**: <br>By providing our users the option to modify individual fields such as `DATE`, `TIME` and `DURATION` for appointments, we are able to streamline and condense frequent operations such as adding and deleting appointments to change appointment details.
  This helps to save a significant amount of time while greatly improving user convenience and experience.
  
  * **Highlights**: <br>This implementation requires a strong understanding of possible edge cases due to it's high complexity and possible coupling with other classes.

* **New Feature**: <br>Added the ability to cancel existing appointments. ([\#97](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/97))
    
  * **Justification**: <br>It is of paramount importance for users to have the ability to delete appointments should patients call to cancel them. This frees up existing time-slots for other patients and avoids confusion.
  
* **Enhancements to existing features**:
    * Added support for the NRIC field when adding a new patient into our system for unique identification. [\#80](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/80)
    * Added indexing for appointments to simplify the command syntax for appointment related operations.
    * Refactored AddressBook to take on a more appropriate name. [\#93](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/93)
    * Added support for editing and adding remarks in the `add` and `edit` features. 
    

* **Project management**:
    * Authored some issues based on the user stories we have identified. 
    * Published release [v1.3.1](https://github.com/AY2021S1-CS2103T-T12-4/tp/releases/tag/v1.3.1) on GitHub   

* **Documentation**:
  * User Guide:
    * Authored Nuddle's introduction and document synopsis: [\#41](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/41)
    * Authored and improved our Quick Start segment to showcase a clear step by step illustration: [\#41](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/41), [\#204](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/204)
    * Updated documentation details for the `add` and `delete` features [\#41](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/41)
    * Authored documentation details for the `remark`, `change` features [\#121](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/121), [\#204](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/204)
    * Added step by step illustrations for the `list`, `delete`, `remark`, `change` features [\#122](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/122), [\#204](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/204)
    
  * Developer Guide:
    * Authored the User Profile and Value Proposition segment. [\#43](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/43)
    * Updated and maintained the Logic component write up. [\#109](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/109)
    * Authored implementation details for the remark feature with the appropriate UML diagrams. [\#133](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/133)

* **Community**:
  * PRs reviewed (with non-trivial review comments): ([\#91](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/91), [\#95](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/95), [\#107](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/107), [\#113](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/113))
  * Contributed to forum discussions
  (examples:
  [1](https://github.com/nus-cs2103-AY2021S1/forum/issues/181),
  [2](https://github.com/nus-cs2103-AY2021S1/forum/issues/166#issuecomment-687836207))
