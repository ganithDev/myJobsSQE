-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2017 at 03:34 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mymscsqeprocv_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `educational_qualification`
--

CREATE TABLE `educational_qualification` (
  `idEducationalQualification` int(10) UNSIGNED NOT NULL,
  `qualificationType` varchar(16) NOT NULL COMMENT 'e.g. BSc, A-level, BSc Hon, BTEC HND  - using auto-complete from edu_qualifications_lookup\n',
  `courseName` varchar(100) NOT NULL COMMENT ' e.g. Biology with Computing, Business Studies - using auto-complete\n',
  `idEducationLevel` smallint(3) UNSIGNED NOT NULL,
  `otherEducationLevel` varchar(45) DEFAULT NULL,
  `vocational` tinyint(1) DEFAULT NULL COMMENT '1 if vocational, 0 if academic\nnull if not sure?  Not sure this is needed.',
  `mainSubject` varchar(45) DEFAULT NULL COMMENT 'e.g. Computer Science, Mechanical Engineering - auto-compelete from subjects-lookup\n',
  `nameOfInstitution` varchar(100) DEFAULT NULL COMMENT 'school, college, university',
  `country` varchar(45) DEFAULT NULL COMMENT 'where qualification gained - auto-lookup or drop-down may be useful',
  `yearObtained` date DEFAULT NULL COMMENT 'year, may be months as well?',
  `result` varchar(20) DEFAULT NULL COMMENT 'e.g. A grade, PASS, 2nd Class Hons, Distinction - where appropriate',
  `thesesTitle` varchar(200) DEFAULT NULL COMMENT 'when approapriate, e.g.final year BSc project title',
  `verified` tinyint(1) DEFAULT NULL COMMENT 'if checked',
  `howVerified` varchar(45) DEFAULT NULL COMMENT 'who checked and how',
  `idPerson` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='post 16 Academic and Vocational - not Professional';

--
-- Dumping data for table `educational_qualification`
--

INSERT INTO `educational_qualification` (`idEducationalQualification`, `qualificationType`, `courseName`, `idEducationLevel`, `otherEducationLevel`, `vocational`, `mainSubject`, `nameOfInstitution`, `country`, `yearObtained`, `result`, `thesesTitle`, `verified`, `howVerified`, `idPerson`) VALUES
(1, '', 'Software Engineering', 1, '', 0, 'Computer Programming', 'Cardiff Universoty', 'United Kingdom', '2016-05-12', 'First class', '', 1, '', 6);

-- --------------------------------------------------------

--
-- Table structure for table `education_level`
--

CREATE TABLE `education_level` (
  `idEducationLevel` smallint(3) UNSIGNED NOT NULL COMMENT 'Sixth-form or equivalent secondary education\nHNC or equivalent\nHND/foundation degree or equivalent\nBA/BSc Degree\nBA/BSc Hons Degree\nBA/BSc Good Hons Degree (2/1 or better)\nMA/MSc or equivalent\nDoctorate',
  `educationLevel` varchar(100) NOT NULL COMMENT 'O-Level\nA-Level\nHND\nDegree\nMSc\nPhD\n'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='e.g. Six-Form; Undergraduate; MSc/MA; Doctorate';

--
-- Dumping data for table `education_level`
--

INSERT INTO `education_level` (`idEducationLevel`, `educationLevel`) VALUES
(1, 'Sixth-form or equivalent secondary education'),
(2, 'HNC or equivalent'),
(3, 'HND/foundation degree or equivalent'),
(4, 'BA/BSc Degree'),
(5, 'BA/BSc Hons Degree'),
(6, 'BA/BSc Good Hons Degree (2/1 or better)'),
(7, 'MA/MBA/MSc or equivalent'),
(8, 'Doctorate');

-- --------------------------------------------------------

--
-- Table structure for table `employment_level`
--

CREATE TABLE `employment_level` (
  `idLevelOfEmployment` smallint(4) UNSIGNED NOT NULL,
  `employmentLevel` varchar(45) NOT NULL COMMENT 'To ascertain the nature of work experience, e.g.\nentry level; experienced/non-manager; supervisor of staff; manager; executive/senior executive'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='for drop-down for experience';

--
-- Dumping data for table `employment_level`
--

INSERT INTO `employment_level` (`idLevelOfEmployment`, `employmentLevel`) VALUES
(1, 'entry level'),
(2, 'experienced/non-manager'),
(3, 'supervisor of staff'),
(4, 'manager'),
(5, 'executive/senior executive');

-- --------------------------------------------------------

--
-- Table structure for table `experience`
--

CREATE TABLE `experience` (
  `idExperience` int(10) UNSIGNED NOT NULL,
  `idPerson` int(10) UNSIGNED NOT NULL,
  `dateStarted` date NOT NULL COMMENT 'this must be unique for each person as it is part the composite PK',
  `dateFinished` date DEFAULT NULL,
  `JobTitles_idJobTitles` smallint(6) NOT NULL,
  `otherJobTitle` varchar(45) DEFAULT NULL COMMENT 'in case a suitable job-title is not found in the drop-down from the job_titles table',
  `keyDuties` varchar(255) DEFAULT NULL COMMENT 'this could be searchable by keywork search!?',
  `employerName` varchar(45) DEFAULT NULL,
  `verified` tinyint(1) DEFAULT NULL,
  `howVerified` varchar(45) DEFAULT NULL,
  `idLevelOfEmployment` smallint(4) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='work experience';

--
-- Dumping data for table `experience`
--

INSERT INTO `experience` (`idExperience`, `idPerson`, `dateStarted`, `dateFinished`, `JobTitles_idJobTitles`, `otherJobTitle`, `keyDuties`, `employerName`, `verified`, `howVerified`, `idLevelOfEmployment`) VALUES
(1, 4, '2015-05-01', '2017-05-01', 21, 'SE', 'PEGA development, Java programming', 'Virtusa', 1, '', 1);

-- --------------------------------------------------------

--
-- Table structure for table `job_preference`
--

CREATE TABLE `job_preference` (
  `idJob_preference` int(11) NOT NULL,
  `idJobTitle` smallint(6) NOT NULL,
  `idPerson` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job_title`
--

CREATE TABLE `job_title` (
  `idJobTitle` smallint(6) NOT NULL,
  `jobTitle` varchar(45) DEFAULT NULL,
  `Sector_idSector` smallint(5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='for drop-down selection from sector/job title';

--
-- Dumping data for table `job_title`
--

INSERT INTO `job_title` (`idJobTitle`, `jobTitle`, `Sector_idSector`) VALUES
(21, 'Software Engineer', 1),
(22, 'Senior Software Engineer', 1),
(23, 'Tech Lead', 1),
(24, 'Software Architect', 1),
(25, 'Electrical Engineer', 2),
(26, 'Industrial Engineer', 2),
(27, 'Engineering Technician', 2),
(28, 'Bank Manager', 3),
(29, 'Bank Officer', 3),
(30, 'Loan Officer', 3);

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `idPerson` int(10) UNSIGNED NOT NULL,
  `idUser` int(11) UNSIGNED NOT NULL,
  `idperson_title` int(11) NOT NULL,
  `forename1` varchar(45) NOT NULL,
  `forename2` varchar(45) DEFAULT NULL,
  `surname` varchar(45) NOT NULL,
  `addressLine1` varchar(45) DEFAULT NULL,
  `addressLine2` varchar(45) DEFAULT NULL,
  `town` varchar(45) DEFAULT NULL,
  `postcode` varchar(10) DEFAULT NULL,
  `secondEmail` varchar(50) DEFAULT NULL COMMENT 'alternative email to be used if any problem with the username (primary email)\n',
  `personalUrl` varchar(64) DEFAULT NULL COMMENT 'increasingly common',
  `photo` text COMMENT 'to be uploaded by the user',
  `female` tinyint(1) DEFAULT NULL COMMENT 'need to check whether there could be legal  issues collecting/using this info\n',
  `postcodeStart` varchar(10) DEFAULT NULL COMMENT 'first part of the the persons address postcode for distance calculation',
  `authorityToWorkStatement` varchar(255) DEFAULT NULL COMMENT 'List restrictions on work, e.g. max 20 hours per week (some non-EU residents)\nE.g. if not null it should be displayed',
  `idcontactPreference` int(11) NOT NULL,
  `noOfGcses` smallint(3) UNSIGNED DEFAULT '0',
  `gcseEnglishGrade` varchar(2) DEFAULT NULL,
  `gcseMathsGrade` varchar(2) DEFAULT NULL,
  `fiveOrMoreGcses` tinyint(1) DEFAULT NULL,
  `noOfAlevels` smallint(4) DEFAULT '0' COMMENT 'entered by the user - could be checked against the number in the Alevels table.\nAS level is 0.5.  What about International Baccalaureate, French Baccalaureate,European Baccalaureate,Scottish Highers etc...',
  `ucasPoints` smallint(4) DEFAULT '0' COMMENT 'needed?',
  `idperson_status` int(11) NOT NULL,
  `mobile` varchar(16) DEFAULT NULL,
  `landline` varchar(16) DEFAULT NULL,
  `dob` date DEFAULT NULL COMMENT 'date of birth - may be required by some employes but cannot be searched on',
  `penaltyPoints` smallint(4) DEFAULT NULL COMMENT 'on the UK driving license - see http://www.direct.gov.uk/en/Motoring/DriverLicensing/EndorsementsAndDisqualifications/DG_4022550',
  `idLevelOfEmployment` smallint(4) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`idPerson`, `idUser`, `idperson_title`, `forename1`, `forename2`, `surname`, `addressLine1`, `addressLine2`, `town`, `postcode`, `secondEmail`, `personalUrl`, `photo`, `female`, `postcodeStart`, `authorityToWorkStatement`, `idcontactPreference`, `noOfGcses`, `gcseEnglishGrade`, `gcseMathsGrade`, `fiveOrMoreGcses`, `noOfAlevels`, `ucasPoints`, `idperson_status`, `mobile`, `landline`, `dob`, `penaltyPoints`, `idLevelOfEmployment`) VALUES
(1, 1, 1, 'ganith', 'dithula', 'perera', '71, 1 lane', 'Katubadde', 'Moratuwa', '10400', 'gani@ya.com', 'null', 'SKLL0274_EDT.JPG', 0, 'SL', 'authorityToWorkStatement', 1, 5, 'A', 'B', 0, 2, 10, 2, '0712281744', '0112587744', '1991-09-21', 11, 1),
(2, 2, 3, 'Naduni', '', 'Pulsarani', '12, Wolk street', '', 'Baybrook', '21331', 'hjk@gh.com', NULL, '', 0, 'SL', 'authorityToWorkStatement', 1, 5, 'A', 'B', 0, 2, 10, 1, '0758895588', '0112558877', '1991-06-28', 11, 1),
(3, 3, 3, 'Naduni', '', 'Pulsarani', '12, Wolk street', '', 'Baybrook', '21331', 'hjk@gh.com', NULL, '', 0, 'SL', 'authorityToWorkStatement', 1, 5, 'A', 'B', 0, 2, 10, 1, '0758895588', '0112558877', '1991-06-28', 11, 1),
(4, 4, 1, 'John', '', 'Smith', '12, Main street', '', 'Lankershire', '789987', 'asd@we.com', NULL, '', 0, 'SL', 'authorityToWorkStatement', 1, 5, 'A', 'B', 0, 2, 10, 1, '0785555555', '0112666888', '1991-06-28', 11, 3),
(5, 5, 1, 'rex', '', 'fern', '23,fox hill', '', 'Ustershire', '88', 'dfg@df.com', NULL, '', 1, 'SL', '40 hrs per week', 1, 5, 'A', 'A', 0, 5, 150, 3, '7877788787', '', '1989-05-03', 11, 4),
(6, 6, 1, 'mary', '', 'sad', '123,River side', '', 'Thames', '559879', 'fgh@fg.com', NULL, '', 1, 'SL', '', 1, 5, 'A', 'C', 0, 1, 156, 1, '5896555555', '', '1990-05-10', 10, 1),
(7, 7, 1, 'ash', '', 'rask', '22, New Islands', '', 'Hamshire', '8789797', 'abc@we.com', NULL, '', 0, 'SL', '', 1, 7, 'A', 'B*', 1, 26879, 174, 1, '1747788995', '', '1989-05-11', 10, 3);

-- --------------------------------------------------------

--
-- Table structure for table `person_contact_mode`
--

CREATE TABLE `person_contact_mode` (
  `idcontactPreference` int(11) NOT NULL,
  `contactMode` varchar(45) NOT NULL COMMENT '''Mobile'',''Landline'',''Email1'',''Email2''\nmobile\\nlandline\\nemail1 (username)\\nemail2 (secondEmail)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `person_contact_mode`
--

INSERT INTO `person_contact_mode` (`idcontactPreference`, `contactMode`) VALUES
(1, 'Mobile'),
(2, 'Email1'),
(3, 'Email2'),
(4, 'Landline');

-- --------------------------------------------------------

--
-- Table structure for table `person_status`
--

CREATE TABLE `person_status` (
  `idperson_status` int(11) NOT NULL,
  `person_status` varchar(45) DEFAULT NULL COMMENT 'if a student then the details of the course should be stored in the Educational_qualifications table'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `person_status`
--

INSERT INTO `person_status` (`idperson_status`, `person_status`) VALUES
(1, 'Full-time'),
(2, 'Part-time'),
(3, 'Not a student');

-- --------------------------------------------------------

--
-- Table structure for table `person_title`
--

CREATE TABLE `person_title` (
  `idperson_title` int(11) NOT NULL,
  `title` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `person_title`
--

INSERT INTO `person_title` (`idperson_title`, `title`) VALUES
(1, 'Mr.'),
(2, 'Mrs.'),
(3, 'Miss'),
(4, 'Ms');

-- --------------------------------------------------------

--
-- Table structure for table `professional_qualification`
--

CREATE TABLE `professional_qualification` (
  `idProfessionalQualification` int(10) UNSIGNED NOT NULL,
  `qualificationName` varchar(100) NOT NULL,
  `idSector` smallint(5) UNSIGNED NOT NULL,
  `awardingBody` varchar(45) DEFAULT NULL COMMENT 'if appropriate - e.g. institute of chartered surveyors',
  `yearObtained` date DEFAULT NULL,
  `classification` varchar(20) DEFAULT NULL COMMENT 'if appropriate - some prof qualification may have classifications - e.g. the legal practice certificate: distinctinction, commendation, pass',
  `verified` tinyint(1) DEFAULT NULL,
  `howVerified` varchar(45) DEFAULT NULL COMMENT 'e.g. examining certificates or lists of members of professional bodies',
  `idPerson` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `professional_qualification`
--

INSERT INTO `professional_qualification` (`idProfessionalQualification`, `qualificationName`, `idSector`, `awardingBody`, `yearObtained`, `classification`, `verified`, `howVerified`, `idPerson`) VALUES
(1, 'Pega CSSA', 1, 'Pega Systems Inc.', '2016-05-17', 'Pass', 1, '', 4);

-- --------------------------------------------------------

--
-- Table structure for table `referee`
--

CREATE TABLE `referee` (
  `idReferee` int(10) UNSIGNED NOT NULL,
  `idPerson` int(10) UNSIGNED NOT NULL,
  `title` varchar(10) DEFAULT NULL,
  `forename` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `contactPhone` varchar(16) DEFAULT NULL,
  `idreferee_relationship` int(11) NOT NULL,
  `permissionToContact` tinyint(1) DEFAULT NULL COMMENT 'the person should get an agreement and tick this box to overwrite the default 0',
  `permissionToStoreDetail` tinyint(1) DEFAULT NULL COMMENT 'person should try to get an agreement and check - otherwise the record will be deleted',
  `verified` tinyint(1) DEFAULT NULL,
  `howVerified` varchar(45) DEFAULT NULL COMMENT 'referee contacted by email/phone/letter',
  `referenceDoc` text COMMENT 'uploaded scanned reference?'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='need to check data protection for referee data';

--
-- Dumping data for table `referee`
--

INSERT INTO `referee` (`idReferee`, `idPerson`, `title`, `forename`, `surname`, `email`, `contactPhone`, `idreferee_relationship`, `permissionToContact`, `permissionToStoreDetail`, `verified`, `howVerified`, `referenceDoc`) VALUES
(1, 4, 'Mr.', 'Mark', 'Seth', 'seth@we.com', '1234567899', 1, 1, 1, 1, '', '');

-- --------------------------------------------------------

--
-- Table structure for table `referee_relationship`
--

CREATE TABLE `referee_relationship` (
  `idreferee_relationship` int(11) NOT NULL,
  `relationship` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `referee_relationship`
--

INSERT INTO `referee_relationship` (`idreferee_relationship`, `relationship`) VALUES
(1, 'employer'),
(2, 'academic');

-- --------------------------------------------------------

--
-- Table structure for table `sector`
--

CREATE TABLE `sector` (
  `idSector` smallint(5) UNSIGNED NOT NULL,
  `sectorTitle` varchar(45) DEFAULT NULL COMMENT 'e.g. from http://www.reed.co.uk/\n\nindustry and non-commercial job sectors\n'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='industry and non-commercial job sectors';

--
-- Dumping data for table `sector`
--

INSERT INTO `sector` (`idSector`, `sectorTitle`) VALUES
(1, 'IT'),
(2, 'Engineering'),
(3, 'Banking'),
(4, 'Health & Medicine'),
(6, 'Human Resources'),
(7, 'Transport & Logistics'),
(8, 'Construction & Property'),
(9, 'Sales'),
(10, 'Marketing & PR'),
(11, 'Media, Digital & Creative'),
(12, 'Motoring & Automotive'),
(13, 'Leisure & Tourism'),
(14, 'Hospitality & Catering'),
(15, 'Education'),
(16, 'Other');

-- --------------------------------------------------------

--
-- Table structure for table `skill`
--

CREATE TABLE `skill` (
  `idSkill` int(10) UNSIGNED NOT NULL,
  `skill_name` varchar(100) NOT NULL COMMENT 'from skills_lookup or chosen name - should be warned that may not be picked up by the business searches'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `skill`
--

INSERT INTO `skill` (`idSkill`, `skill_name`) VALUES
(1, 'Business Communication'),
(2, 'Presentation Skills'),
(3, 'Leadership skills'),
(4, 'Technical Writing'),
(5, 'Analytical Thinking');

-- --------------------------------------------------------

--
-- Table structure for table `skill_level`
--

CREATE TABLE `skill_level` (
  `idskill_level` int(11) NOT NULL,
  `skill_level` varchar(45) DEFAULT NULL COMMENT '''Basic'',''Good'',''Excellent''\nsubjective - but may be crossreferenced to to ER tests'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `skill_level`
--

INSERT INTO `skill_level` (`idskill_level`, `skill_level`) VALUES
(1, 'Basic'),
(2, 'Good'),
(3, 'Excellent');

-- --------------------------------------------------------

--
-- Table structure for table `skill_person`
--

CREATE TABLE `skill_person` (
  `idSkill_person` int(10) UNSIGNED NOT NULL,
  `idPerson` int(10) UNSIGNED NOT NULL,
  `idSkill` int(10) UNSIGNED NOT NULL,
  `idskill_level` int(11) NOT NULL,
  `verified` tinyint(1) DEFAULT NULL,
  `howVerified` varchar(45) DEFAULT NULL COMMENT 'reference, ER test or other evidence of competence'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `skill_person`
--

INSERT INTO `skill_person` (`idSkill_person`, `idPerson`, `idSkill`, `idskill_level`, `verified`, `howVerified`) VALUES
(0, 4, 1, 2, 1, '');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `idUser` int(11) UNSIGNED NOT NULL,
  `username` varchar(50) NOT NULL COMMENT 'must be a valid email',
  `password` varchar(16) NOT NULL COMMENT 'encrypt',
  `registerDate` timestamp NULL DEFAULT NULL,
  `idUser_type` smallint(3) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idUser`, `username`, `password`, `registerDate`, `idUser_type`) VALUES
(1, 'ganithperera@outlook.com', '+nkCcN8TzMM=', '2017-04-12 15:27:12', 3),
(2, 'naduni@gmail.com', 'wR9m/LF9bSk=', '2017-05-06 03:49:41', 2),
(3, 'naduni@il.com', 'WnatjqL5B1I=', '2017-05-06 03:58:37', 1),
(4, 'john@gmail.com', '6vp7xNVrVFE=', '2017-05-07 14:12:16', 1),
(5, 'rex@cn.com', '112233', '2017-05-11 12:20:23', 1),
(6, 'man@wrl.com', 'w8y/IR0jROU=', '2017-05-11 12:55:45', 1),
(7, 'ash@gml.com', '/o2Kfj1Pifk=', '2017-05-11 13:18:58', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user_type`
--

CREATE TABLE `user_type` (
  `idUser_type` smallint(3) UNSIGNED NOT NULL,
  `user_type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_type`
--

INSERT INTO `user_type` (`idUser_type`, `user_type`) VALUES
(1, 'JobSeeker'),
(2, 'Agency'),
(3, 'Admin'),
(4, 'other');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `educational_qualification`
--
ALTER TABLE `educational_qualification`
  ADD PRIMARY KEY (`idEducationalQualification`),
  ADD KEY `fk_EduQuals_EducationLevels` (`idEducationLevel`),
  ADD KEY `fk_educational_qualification_person1_idx` (`idPerson`);

--
-- Indexes for table `education_level`
--
ALTER TABLE `education_level`
  ADD PRIMARY KEY (`idEducationLevel`);

--
-- Indexes for table `employment_level`
--
ALTER TABLE `employment_level`
  ADD PRIMARY KEY (`idLevelOfEmployment`);

--
-- Indexes for table `experience`
--
ALTER TABLE `experience`
  ADD PRIMARY KEY (`idExperience`),
  ADD KEY `fk_Experiences_JobTitles` (`JobTitles_idJobTitles`),
  ADD KEY `fk_experience_person1_idx` (`idPerson`),
  ADD KEY `fk_experience_employment_level1_idx` (`idLevelOfEmployment`);

--
-- Indexes for table `job_preference`
--
ALTER TABLE `job_preference`
  ADD PRIMARY KEY (`idJob_preference`),
  ADD KEY `fk_job_titles_has_persons_job_titles1_idx` (`idJobTitle`),
  ADD KEY `fk_job_preference_person1_idx` (`idPerson`);

--
-- Indexes for table `job_title`
--
ALTER TABLE `job_title`
  ADD PRIMARY KEY (`idJobTitle`),
  ADD KEY `fk_JobTitles_Sectors` (`Sector_idSector`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`idPerson`),
  ADD KEY `fk_person_employment_level1_idx` (`idLevelOfEmployment`),
  ADD KEY `fk_person_user1_idx` (`idUser`),
  ADD KEY `fk_person_person_title1_idx` (`idperson_title`),
  ADD KEY `fk_person_person_status1_idx` (`idperson_status`),
  ADD KEY `fk_person_person_contact_mode1_idx` (`idcontactPreference`);

--
-- Indexes for table `person_contact_mode`
--
ALTER TABLE `person_contact_mode`
  ADD PRIMARY KEY (`idcontactPreference`);

--
-- Indexes for table `person_status`
--
ALTER TABLE `person_status`
  ADD PRIMARY KEY (`idperson_status`);

--
-- Indexes for table `person_title`
--
ALTER TABLE `person_title`
  ADD PRIMARY KEY (`idperson_title`);

--
-- Indexes for table `professional_qualification`
--
ALTER TABLE `professional_qualification`
  ADD PRIMARY KEY (`idProfessionalQualification`),
  ADD KEY `fk_ProfessionalQualifications_Sectors` (`idProfessionalQualification`),
  ADD KEY `fk_professional_qualification_person1_idx` (`idPerson`),
  ADD KEY `fk_professional_qualification_sector1_idx` (`idSector`);

--
-- Indexes for table `referee`
--
ALTER TABLE `referee`
  ADD PRIMARY KEY (`idReferee`),
  ADD KEY `fk_referee_person1_idx` (`idPerson`),
  ADD KEY `fk_referee_referee_relationship1_idx` (`idreferee_relationship`);

--
-- Indexes for table `referee_relationship`
--
ALTER TABLE `referee_relationship`
  ADD PRIMARY KEY (`idreferee_relationship`);

--
-- Indexes for table `sector`
--
ALTER TABLE `sector`
  ADD PRIMARY KEY (`idSector`);

--
-- Indexes for table `skill`
--
ALTER TABLE `skill`
  ADD PRIMARY KEY (`idSkill`);

--
-- Indexes for table `skill_level`
--
ALTER TABLE `skill_level`
  ADD PRIMARY KEY (`idskill_level`);

--
-- Indexes for table `skill_person`
--
ALTER TABLE `skill_person`
  ADD PRIMARY KEY (`idSkill_person`),
  ADD KEY `fk_skill_person1_idx` (`idPerson`),
  ADD KEY `fk_skill_person_skill1_idx` (`idSkill`),
  ADD KEY `fk_skill_person_skill_level1_idx` (`idskill_level`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`),
  ADD KEY `fk_user_user_type1_idx` (`idUser_type`);

--
-- Indexes for table `user_type`
--
ALTER TABLE `user_type`
  ADD PRIMARY KEY (`idUser_type`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `educational_qualification`
--
ALTER TABLE `educational_qualification`
  MODIFY `idEducationalQualification` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `education_level`
--
ALTER TABLE `education_level`
  MODIFY `idEducationLevel` smallint(3) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Sixth-form or equivalent secondary education\nHNC or equivalent\nHND/foundation degree or equivalent\nBA/BSc Degree\nBA/BSc Hons Degree\nBA/BSc Good Hons Degree (2/1 or better)\nMA/MSc or equivalent\nDoctorate', AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `employment_level`
--
ALTER TABLE `employment_level`
  MODIFY `idLevelOfEmployment` smallint(4) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `experience`
--
ALTER TABLE `experience`
  MODIFY `idExperience` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `job_preference`
--
ALTER TABLE `job_preference`
  MODIFY `idJob_preference` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `job_title`
--
ALTER TABLE `job_title`
  MODIFY `idJobTitle` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `idPerson` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `person_contact_mode`
--
ALTER TABLE `person_contact_mode`
  MODIFY `idcontactPreference` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `person_status`
--
ALTER TABLE `person_status`
  MODIFY `idperson_status` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `person_title`
--
ALTER TABLE `person_title`
  MODIFY `idperson_title` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `professional_qualification`
--
ALTER TABLE `professional_qualification`
  MODIFY `idProfessionalQualification` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `referee`
--
ALTER TABLE `referee`
  MODIFY `idReferee` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `referee_relationship`
--
ALTER TABLE `referee_relationship`
  MODIFY `idreferee_relationship` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `sector`
--
ALTER TABLE `sector`
  MODIFY `idSector` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `skill`
--
ALTER TABLE `skill`
  MODIFY `idSkill` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `skill_level`
--
ALTER TABLE `skill_level`
  MODIFY `idskill_level` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `user_type`
--
ALTER TABLE `user_type`
  MODIFY `idUser_type` smallint(3) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `educational_qualification`
--
ALTER TABLE `educational_qualification`
  ADD CONSTRAINT `fk_EduQuals_EducationLevels` FOREIGN KEY (`idEducationLevel`) REFERENCES `education_level` (`idEducationLevel`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_educational_qualification_person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `experience`
--
ALTER TABLE `experience`
  ADD CONSTRAINT `fk_Experiences_JobTitles` FOREIGN KEY (`JobTitles_idJobTitles`) REFERENCES `job_title` (`idJobTitle`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_experience_employment_level1` FOREIGN KEY (`idLevelOfEmployment`) REFERENCES `employment_level` (`idLevelOfEmployment`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_experience_person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `job_preference`
--
ALTER TABLE `job_preference`
  ADD CONSTRAINT `fk_job_preference_person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_job_titles_has_persons_job_titles1` FOREIGN KEY (`idJobTitle`) REFERENCES `job_title` (`idJobTitle`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `job_title`
--
ALTER TABLE `job_title`
  ADD CONSTRAINT `fk_JobTitles_Sectors` FOREIGN KEY (`Sector_idSector`) REFERENCES `sector` (`idSector`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `person`
--
ALTER TABLE `person`
  ADD CONSTRAINT `fk_person_employment_level1` FOREIGN KEY (`idLevelOfEmployment`) REFERENCES `employment_level` (`idLevelOfEmployment`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_person_person_contact_mode1` FOREIGN KEY (`idcontactPreference`) REFERENCES `person_contact_mode` (`idcontactPreference`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_person_person_status1` FOREIGN KEY (`idperson_status`) REFERENCES `person_status` (`idperson_status`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_person_person_title1` FOREIGN KEY (`idperson_title`) REFERENCES `person_title` (`idperson_title`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_person_user1` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `professional_qualification`
--
ALTER TABLE `professional_qualification`
  ADD CONSTRAINT `fk_professional_qualification_person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_professional_qualification_sector1` FOREIGN KEY (`idSector`) REFERENCES `sector` (`idSector`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `referee`
--
ALTER TABLE `referee`
  ADD CONSTRAINT `fk_referee_person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_referee_referee_relationship1` FOREIGN KEY (`idreferee_relationship`) REFERENCES `referee_relationship` (`idreferee_relationship`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `skill_person`
--
ALTER TABLE `skill_person`
  ADD CONSTRAINT `fk_skill_person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_skill_person_skill1` FOREIGN KEY (`idSkill`) REFERENCES `skill` (`idSkill`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_skill_person_skill_level1` FOREIGN KEY (`idskill_level`) REFERENCES `skill_level` (`idskill_level`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `fk_user_user_type1` FOREIGN KEY (`idUser_type`) REFERENCES `user_type` (`idUser_type`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
