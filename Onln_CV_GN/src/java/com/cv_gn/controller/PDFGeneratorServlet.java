/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.controller;

import com.cv_gn.dao.ManagerDAO;
import com.cv_gn.dao.PersonDAOImpl;
import com.cv_gn.model.EducationalQualification;
import com.cv_gn.model.Experience;
import com.cv_gn.model.Person;
import com.cv_gn.model.ProfessionalQualification;
import com.cv_gn.model.Referee;
import com.cv_gn.model.SkillPerson;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shalini
 */
public class PDFGeneratorServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*sets the content type as PDF */
        response.setContentType("application/pdf");
        Document document = new Document();
        try {
            try {
                /* Servlet Outputstream is passed to generate the PDF */
                PdfWriter.getInstance(document, response.getOutputStream());
            } catch (DocumentException ex) {
                Logger.getLogger(PDFGeneratorServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();

            String personID = request.getParameter("personID");
            Person p = (Person) ManagerDAO.openDBSession().load(Person.class, Integer.parseInt(personID));

            PdfPTable pdfTable = new PdfPTable(2);

            pdfTable.addCell("Name");
            pdfTable.addCell(p.getPersonTitle().getTitle() + "." + p.getForename1() + " " + p.getSurname());
            pdfTable.addCell("Email");
            pdfTable.addCell(p.getUser().getUsername());
            pdfTable.addCell("Mobile");
            pdfTable.addCell(p.getMobile());

            String jobPrfered = new PersonDAOImpl().loadPreferredJobForPerson(p);
              pdfTable.addCell("Prefered Job Title");
            pdfTable.addCell(jobPrfered);
            pdfTable.addCell("UCAS point");
            pdfTable.addCell(p.getUcasPoints().toString());
            pdfTable.addCell("GCSE Maths Grade");
            pdfTable.addCell(p.getGcseMathsGrade());
            pdfTable.addCell("GCSE English Grade");
            pdfTable.addCell(p.getGcseEnglishGrade());
            pdfTable.addCell("Prefered Employment Level");
            pdfTable.addCell(p.getEmploymentLevel().getEmploymentLevel());

            PdfPTable pdfBlnk = new PdfPTable(1);
            pdfBlnk.addCell("");
            int i = 0;
            PdfPTable pdfEduTbl = new PdfPTable(2);
            List<EducationalQualification> lstEd = new PersonDAOImpl().loadEduQualification(p.getUser());
            for (EducationalQualification eq : lstEd) {
                i++;
                pdfEduTbl.addCell("Educational Qualification");
                pdfEduTbl.addCell("(" + i + ")");
                pdfEduTbl.addCell("Course Name");
                pdfEduTbl.addCell(eq.getCourseName());
                pdfEduTbl.addCell("Main Subject");
                pdfEduTbl.addCell(eq.getMainSubject());
                pdfEduTbl.addCell("Education Level");
                pdfEduTbl.addCell(eq.getEducationLevel().getEducationLevel());
                pdfEduTbl.addCell("Institution");
                pdfEduTbl.addCell(eq.getNameOfInstitution());
                pdfEduTbl.addCell("Result");
                pdfEduTbl.addCell(eq.getResult());
                pdfEduTbl.addCell("Theses Title");
                pdfEduTbl.addCell(eq.getThesesTitle());

            }
int j=0;
            PdfPTable pdfProfTbl = new PdfPTable(2);
            List<ProfessionalQualification> lstProf = new PersonDAOImpl().loadProfQualification(p.getUser());
            for (ProfessionalQualification prof : lstProf) {
                j++;
                pdfProfTbl.addCell("Professional Qualification");
                pdfProfTbl.addCell("(" + j + ")");
                pdfProfTbl.addCell("Qualification Name");
                pdfProfTbl.addCell(prof.getQualificationName());
                pdfProfTbl.addCell("Awarding Body");
                pdfProfTbl.addCell(prof.getAwardingBody());
                pdfProfTbl.addCell("Sector");
                pdfProfTbl.addCell(prof.getSector().getSectorTitle());
                pdfProfTbl.addCell("Classification");
                pdfProfTbl.addCell(prof.getClassification());
                pdfProfTbl.addCell("Acheived On");
                pdfProfTbl.addCell(prof.getYearObtained().toString());

            }
int k=0;
            PdfPTable pdfExpTbl = new PdfPTable(2);
            List<Experience> lstExp = new PersonDAOImpl().loadExperience(p.getUser());
            for (Experience exp : lstExp) {
                k++;
                pdfExpTbl.addCell("Work Experience");
                pdfExpTbl.addCell("(" + k + ")");
                pdfExpTbl.addCell("Job Title");
                pdfExpTbl.addCell(exp.getJobTitle().getJobTitle());
                pdfExpTbl.addCell("Awarding Body");
                pdfExpTbl.addCell(exp.getEmployerName());
                pdfExpTbl.addCell("Employment Level");
                pdfExpTbl.addCell(exp.getEmploymentLevel().getEmploymentLevel());

                pdfExpTbl.addCell("Key Duties");
                pdfExpTbl.addCell(exp.getKeyDuties());
                pdfExpTbl.addCell("FROM");
                pdfExpTbl.addCell(exp.getDateFinished().toString());
                pdfExpTbl.addCell("TO");
                pdfExpTbl.addCell(exp.getDateFinished().toString());

            }
int l=0;
            PdfPTable pdfSklTbl = new PdfPTable(2);
            List<SkillPerson> lstSkl = new PersonDAOImpl().loadSkills(p.getUser());
            for (SkillPerson skl : lstSkl) {
                l++;
                pdfSklTbl.addCell("Skill");
                pdfSklTbl.addCell("(" + l + ")");
                pdfSklTbl.addCell("Skill Name");
                pdfSklTbl.addCell(skl.getSkill().getSkillName());
                pdfSklTbl.addCell("Skill Level");
                pdfSklTbl.addCell(skl.getSkillLevel().getSkillLevel());

            }
int m=0;
            PdfPTable pdfRefTbl = new PdfPTable(2);
            List<Referee> lstRef = new PersonDAOImpl().loadReferees(p.getUser());
            for (Referee ref : lstRef) {
                m++;
                pdfRefTbl.addCell("Referee");
                pdfRefTbl.addCell("(" + m + ")");
                pdfRefTbl.addCell("Name");
                pdfRefTbl.addCell(ref.getTitle() + "." + ref.getForename() + " " + ref.getSurname());
                pdfRefTbl.addCell("Skill Level");
                pdfRefTbl.addCell(ref.getRefereeRelationship().getRelationship());
                pdfRefTbl.addCell("Contact Phone");
                pdfRefTbl.addCell(ref.getContactPhone());
                pdfRefTbl.addCell("Email");
                pdfRefTbl.addCell(ref.getEmail());

            }

            document.add(pdfTable);
            document.add(pdfBlnk);
            document.add(pdfEduTbl);
            document.add(pdfProfTbl);
            document.add(pdfSklTbl);
            document.add(pdfRefTbl);

            document.addTitle(p.getPersonTitle().getTitle() + "." + p.getForename1() + " " + p.getSurname() + " - " + jobPrfered);
            document.close();
        } catch (DocumentException e) {

            e.printStackTrace();
        }
    }
}
