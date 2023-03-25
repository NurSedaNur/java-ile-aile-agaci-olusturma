/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seda;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author sedan
 */
public class sonproje {

    public static final String SAMPLE_XLSX_FILE_PATH = "C:\\Users\\sedan\\Desktop\\view.xlsx";

    public static void main(String[] args) throws IOException, InvalidFormatException {

        ArrayList<AgacNode> agactakiDugumler = new ArrayList<AgacNode>();
        Workbook wb = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
        
//        for (int l = 0; l < 4; l++) {
            Sheet sheet = wb.getSheetAt(1);

            DataFormatter dataFormatter = new DataFormatter();//tarih formatı icin kullandık

            Iterator<Row> rowIterator = sheet.rowIterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                AgacNode ekle = new AgacNode();
                AileUyesi kim = new AileUyesi();
                Iterator<Cell> cellIterator = row.cellIterator();
                int hucre = 0;
                
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    String cellValue = dataFormatter.formatCellValue(cell);//tarih icin kullandık
                    
//                    if (hucre == 0) { //tc yi okumadı kapattık
//                        kim.tc_no = cellValue; }
                /*else*/ if (hucre == 0) {
                        kim.ad = cellValue;
                    } else if (hucre == 1) {
                        kim.soyad = cellValue;
                    } else if (hucre == 2) {
                        kim.doğumTarihi = cellValue;
                    } else if (hucre == 3) {
                        ekle.uyeninEsi = cellValue;
                    } else if (hucre == 4) {
                        kim.anneAdı = cellValue;
                    } else if (hucre == 5) {
                        kim.babaAdı = cellValue;
                    } else if (hucre == 6) {
                        kim.kanGrubu = cellValue;
                    } else if (hucre == 7) {
                        kim.meslek = cellValue;
                    } else if (hucre == 8) {
                        ekle.evliBekar = cellValue;
                    } else if (hucre == 9) {
                        kim.kızlıkSoyadı = cellValue;
                    }
                    else if (hucre == 10) {
                        kim.cinsiyet = cellValue;
                    }
                    hucre++;
                }
                ekle.uye = kim;
                agactakiDugumler.add(ekle);

            }

        

        Agac agac = new Agac();
        agac.ilk = agactakiDugumler.get(1);
        for (int i = 1; i < agactakiDugumler.size(); i++) {
            agac.ekle(agac.ilk, agactakiDugumler.get(i));
        }
        
       Scanner sc=new Scanner(System.in);
       System.out.println("hangi isteri istersiniz:");
       System.out.println(" 1:1.ister\n 2:2.ister\n 3:3.ister\n 4:4.ister\n 5.5.ister\n 6.6.ister\n 7.7.ister\n 8.8.ister\n 9.9.ister\n 10.10.ister\n  ");
       int a=sc.nextInt();
       switch(a){
            case 1:
                System.out.println("1. ister:\n");break;
            case 2:
            {
                System.out.println("2. ister:\n");
                for (int i = 1; i < agactakiDugumler.size(); i++) {
                    for(int j=i+1;j<agactakiDugumler.size();j++){
                        if((agactakiDugumler.get(i).uye.anneAdı.equals(agactakiDugumler.get(j).uye.anneAdı)&& !(agactakiDugumler.get(i).uye.babaAdı.equals(agactakiDugumler.get(j).uye.babaAdı))) ||(agactakiDugumler.get(i).uye.babaAdı.equals(agactakiDugumler.get(j).uye.babaAdı)&& !(agactakiDugumler.get(i).uye.anneAdı.equals(agactakiDugumler.get(j).uye.anneAdı)))  ){
                            System.out.println(agactakiDugumler.get(i).uye.ad+"-- ile ---"+agactakiDugumler.get(j).uye.ad+" üvey kardes");
                        } 
                    } 
                }

            }
            break;
            case 3:
            {
                System.out.println("3. ister:\n");
                for (int i = 1; i < agactakiDugumler.size(); i++) {
                    if(agactakiDugumler.get(i).uye.kanGrubu.equals("A(-)")|| agactakiDugumler.get(i).uye.kanGrubu.equals("A(+)")){
                    System.out.println("su kişinin "+agactakiDugumler.get(i).uye.ad+agactakiDugumler.get(i).uye.kanGrubu+"-- esitt");
                    } 
                }
            }break;
            case 4:
            {
                for (int i = 1; i < agactakiDugumler.size(); i++) {
                    for(int j=i+1;j<agactakiDugumler.size();j++){
                        if(agactakiDugumler.get(i).uye.meslek.equals(agactakiDugumler.get(j).uye.meslek)){
                            System.out.println(agactakiDugumler.get(i).uye.ad+"-- ile ---"+agactakiDugumler.get(j).uye.ad+"  meslegi:"+agactakiDugumler.get(j).uye.meslek);
                        } 
                    }
                }
            }break;
            case 5:
            {
                for (int i = 1; i < agactakiDugumler.size(); i++) {
                    if(agac.ilk.uye.ad.equals(agactakiDugumler.get(i).uye.ad)){
                        System.out.println(agac.ilk.uye.ad+"-- esitt");
                        System.out.println(" yaslari: "+agac.ilk.uye.doğumTarihi);
                        System.out.println();
                    }    
                }
            }break;
            case 6:System.out.println("6.ister:\n");break;
            case 7:System.out.println("7.ister:\n");break;
            case 8:System.out.println("8. ister:\n");break;
            case 9:System.out.println("9. ister:\n");break;
            case 10:System.out.println("10. ister.\n");break;
           
            
        }
         
//        agac.ekle(agac.ilk, agactakiDugumler.get(agactakiDugumler.size()-1));  //++++++++++++++++++++++++++++++++++++++++++

//        System.out.println(agac.ilk.uye.ad);
//        Agac.ara(agac.ilk);
//        System.out.println(agac.ilk.uyeninEsi);
//        System.out.println("----"+agac.ilk.cocuk.cocuk.uyekardes.uyeninEsi);
//
//        System.out.println(agac.ilk.uye.babaAdı);
//        System.out.println("--" + agac.ilk.cocuk.cocuk.uyekardes.uye.ad);
//        System.out.println("----"+agac.ilk.cocuk.uyekardes.uyeninEsi);

//        System.out.println("----"+agac.ilk.cocuk.cocuk.cocuk.uye.ad);//irem de hata var
//        System.out.println("--"+agac.ilk.cocuk.cocuk.uyekardes.cocuk.uye.ad);//hata veriyor -ali icin 
//
//        System.out.println("---"+agac.ilk.cocuk.uyekardes.cocuk.uyekardes.uyekardes.uye.ad); 
//        System.out.println("--"+agac.ilk.cocuk.uyekardes.uyekardes.cocuk.uye.ad);

 wb.close();



    }}          
