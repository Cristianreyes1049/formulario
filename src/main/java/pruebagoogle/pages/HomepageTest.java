package pruebagoogle.pages;

import com.ibm.icu.impl.number.Parse;
import org.apache.poi.hssf.usermodel.*;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;

public class HomepageTest {

       /*public static List<Object> DATA;

        static {
            DATA = Arrays.asList(new Object[] {
                    new Object[] { "PlayStation 4 (PS4) - Consola 500GB", new BigDecimal("340.95"), "https://www.amazon.es/PlayStation-4-PS4-Consola-500GB/dp/B013U9CW8A" },
                    new Object[] { "Raspberry Pi 3 Modelo B (1,2 GHz Quad-core ARM Cortex-A53, 1GB RAM, USB 2.0)", new BigDecimal("41.95"), "https://www.amazon.es/Raspberry-Modelo-GHz-Quad-core-Cortex-A53/dp/B01CD5VC92/" },
                    new Object[] { "Gigabyte Brix - Barebón (Intel, Core i5, 2,6 GHz, 6, 35 cm (2.5\"), Serial ATA III, SO-DIMM) Negro ", new BigDecimal("421.36"), "https://www.amazon.es/Gigabyte-Brix-Bareb%C3%B3n-Serial-SO-DIMM/dp/B00HFCTUPM/" }
            });
        }*/

        public static void main(String[] args) throws Exception {
            //writeExcel();
            readExcel();

            //writeCsv();
            //readCsv();
        }



        public static void readExcel() throws Exception {
            HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream("D:\\Documentos Cristian Camilo Reyes\\Documents\\Automatizacion\\Formulario\\data.xls"));
            HSSFSheet sheet = wb.getSheetAt(0);

            int rows = sheet.getLastRowNum();
            for (int i = 1; i < rows; ++i) {
                HSSFRow row = sheet.getRow(i);

                HSSFCell name = row.getCell(0);
                HSSFCell lastname = row.getCell(1);
                HSSFCell country = row.getCell(2);
                HSSFCell birthday = row.getCell(3);
                HSSFCell marital = row.getCell(4);
                HSSFCell gender = row.getCell(5);
                HSSFCell education = row.getCell(6);
                HSSFCell nameref1 = row.getCell(7);
                HSSFCell lastref1 = row.getCell(8);
                HSSFCell mailref1 = row.getCell(9);
                HSSFCell nameref2 = row.getCell(10);
                HSSFCell lastref2 = row.getCell(11);
                HSSFCell mailref2 = row.getCell(12);

                String wname = name.getStringCellValue();

                //HSSFRichTextString wbirthday = birthday.getRichStringCellValue();

                String wlastname = lastname.getStringCellValue();
                String wcountry = country.getStringCellValue();
                String wmarital = marital.getStringCellValue();
                String wgender = gender.getStringCellValue();
                String weducation = education.getStringCellValue();
                String wnameref1 = nameref1.getStringCellValue();
                String wlastref1 = lastref1.getStringCellValue();
                String wmailref1 = mailref1.getStringCellValue();
                String wnameref2 = nameref2.getStringCellValue();
                String wlastref2 = lastref2.getStringCellValue();
                String wmailref2 = mailref2.getStringCellValue();

                System.out.printf("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s%n,", wname, birthday, wlastname,wcountry, wmarital, wgender, weducation,
                wnameref1, wlastref1, wmailref1, wnameref2, wlastref2, wmailref2);
            }
        }


    }

