-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2017 at 03:04 PM
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
  `title` varchar(10) DEFAULT NULL,
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
  `contactPreference` enum('Mobile','Landline','Email1','Email2') DEFAULT NULL COMMENT 'mobile\nlandline\nemail1 (username)\nemail2 (secondEmail)',
  `noOfGcses` smallint(3) UNSIGNED DEFAULT '0',
  `gcseEnglishGrade` varchar(2) DEFAULT NULL,
  `gcseMathsGrade` varchar(2) DEFAULT NULL,
  `fiveOrMoreGcses` tinyint(1) DEFAULT NULL,
  `noOfAlevels` smallint(4) DEFAULT '0' COMMENT 'entered by the user - could be checked against the number in the Alevels table.\nAS level is 0.5.  What about International Baccalaureate, French Baccalaureate,European Baccalaureate,Scottish Highers etc...',
  `ucasPoints` smallint(4) DEFAULT '0' COMMENT 'needed?',
  `studentStatus` enum('Full-time','Part-time','Not a student') DEFAULT NULL COMMENT 'if a student then the details of the course should be stored in the Educational_qualifications table',
  `mobile` varchar(16) DEFAULT NULL,
  `landline` varchar(16) DEFAULT NULL,
  `dob` date DEFAULT NULL COMMENT 'date of birth - may be required by some employes but cannot be searched on',
  `penaltyPoints` smallint(4) DEFAULT NULL COMMENT 'on the UK driving license - see http://www.direct.gov.uk/en/Motoring/DriverLicensing/EndorsementsAndDisqualifications/DG_4022550',
  `idLevelOfEmployment` smallint(4) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`idPerson`, `idUser`, `title`, `forename1`, `forename2`, `surname`, `addressLine1`, `addressLine2`, `town`, `postcode`, `secondEmail`, `personalUrl`, `photo`, `female`, `postcodeStart`, `authorityToWorkStatement`, `contactPreference`, `noOfGcses`, `gcseEnglishGrade`, `gcseMathsGrade`, `fiveOrMoreGcses`, `noOfAlevels`, `ucasPoints`, `studentStatus`, `mobile`, `landline`, `dob`, `penaltyPoints`, `idLevelOfEmployment`) VALUES
(1, 1, 'Mrs', 'ganith', 'dithula', 'perera', '71, 1 lane', 'Katubadde', 'Moratuwa', '10400', 'gani@ya.com', 'null', 'SKLL0274_EDT.JPG', 0, 'SL', 'authorityToWorkStatement', 'Mobile', 5, 'A', 'B', 0, 2, 10, 'Full-time', '0712281744', '0112587744', '1991-09-21', 11, 1),
(2, 3, 'Mrs', 'fsd', 'dgdf', 'dgdf', 'dfgdf', 'dgdf', 'dfgd', '10230', 'naduni@kljlj', 'null', 'cat-modern-home-design.jpg', 0, 'SL', 'authorityToWorkStatement', 'Mobile', 5, 'A', 'B', 0, 2, 10, 'Full-time', '0719995375', '0112749145', '1991-02-07', 11, 1),
(3, 4, 'Mrs', 'Kamal', 'Nisala', 'Perera', '103/1,', 'Colombo 04', 'Bambalapitiy', '10150', 'kamal@gmail.com', 'null', '87573__Interior - New - myname - Design.jpg', 0, 'SL', 'authorityToWorkStatement', 'Mobile', 5, 'A', 'B', 0, 2, 10, 'Full-time', '0718895375', '0112849145', '1991-02-07', 11, 1);

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
  `relationship` enum('employer','academic') DEFAULT NULL,
  `permissionToContact` tinyint(1) DEFAULT NULL COMMENT 'the person should get an agreement and tick this box to overwrite the default 0',
  `permissionToStoreDetail` tinyint(1) DEFAULT NULL COMMENT 'person should try to get an agreement and check - otherwise the record will be deleted',
  `verified` tinyint(1) DEFAULT NULL,
  `howVerified` varchar(45) DEFAULT NULL COMMENT 'referee contacted by email/phone/letter',
  `referenceDoc` text COMMENT 'uploaded scanned reference?'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='need to check data protection for referee data';

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
-- Table structure for table `skill_person`
--

CREATE TABLE `skill_person` (
  `idSkill_person` int(10) UNSIGNED NOT NULL,
  `idPerson` int(10) UNSIGNED NOT NULL,
  `idSkill` int(10) UNSIGNED NOT NULL,
  `skillLevel` enum('Basic','Good','Excellent') DEFAULT NULL COMMENT 'subjective - but may be crossreferenced to to ER tests',
  `verified` tinyint(1) DEFAULT NULL,
  `howVerified` varchar(45) DEFAULT NULL COMMENT 'reference, ER test or other evidence of competence'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(1, 'ganithperera@outlook.com', '123456', '2017-04-12 15:27:12', 1),
(2, 'naduni@sfsd', 'aaaaaa', '2017-04-15 09:02:53', 1),
(3, 'naduni@dgfd', 'aaaaaa', '2017-04-15 12:16:13', 1),
(4, 'kamal@gmail.com', 'aaaaaa', '2017-04-15 13:24:03', 1);

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
  ADD KEY `fk_person_user1_idx` (`idUser`);

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
  ADD KEY `fk_referee_person1_idx` (`idPerson`);

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
-- Indexes for table `skill_person`
--
ALTER TABLE `skill_person`
  ADD PRIMARY KEY (`idSkill_person`),
  ADD KEY `fk_skill_person1_idx` (`idPerson`),
  ADD KEY `fk_skill_person_skill1_idx` (`idSkill`);

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
  MODIFY `idEducationalQualification` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
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
  MODIFY `idExperience` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
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
  MODIFY `idPerson` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `professional_qualification`
--
ALTER TABLE `professional_qualification`
  MODIFY `idProfessionalQualification` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `referee`
--
ALTER TABLE `referee`
  MODIFY `idReferee` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
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
-- AUTO_INCREMENT for table `skill_person`
--
ALTER TABLE `skill_person`
  MODIFY `idSkill_person` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
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
  ADD CONSTRAINT `fk_referee_person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `skill_person`
--
ALTER TABLE `skill_person`
  ADD CONSTRAINT `fk_skill_person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_skill_person_skill1` FOREIGN KEY (`idSkill`) REFERENCES `skill` (`idSkill`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `fk_user_user_type1` FOREIGN KEY (`idUser_type`) REFERENCES `user_type` (`idUser_type`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
