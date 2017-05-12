/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
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
            
            String title = request.getParameter("secondName");
            System.out.println("title : "+title);
            String firstName = request.getParameter("firstName");
            System.out.println("firstName : "+firstName);
            String Naduni = "Naduni Pulsarani";

            PdfPTable pdfTable = new PdfPTable(2);
            
            pdfTable.addCell(Naduni);
            pdfTable.addCell(title);
            pdfTable.addCell(firstName);
           
            pdfTable.addCell("Name");
            pdfTable.addCell("Occupation");
            pdfTable.addCell("Shalini");
            pdfTable.addCell("Software Engineer");
            pdfTable.addCell("Crazy");
            pdfTable.addCell("Blogger");
            
            
            

            document.add(pdfTable);
            
            
            String Name = "CV";
            document.addTitle(Name);
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
