package plata;

import junit.framework.TestCase;
public class m1Test extends TestCase {
public void test() throws Exception {
		try{
			plata sc = new plata();
		    sc.arrTf[0].setText("25.5");//cold water
            sc.arrTf[1].setText("30");//hot water
            sc.arrTf[2].setText("15.68");//svet
            sc.arrTf[6].setText("500");//v potrachennogo hot water
            sc.arrTf[7].setText("400");//v potrachennogo cold water
            sc.arrTf[8].setText("300");//v potrachennogo svet
            sc.kvartira();
        	assertEquals("10200,00", sc.arrTf[12].getText());//Cena na cold water
        	assertEquals("15000,00", sc.arrTf[13].getText());//Cena na hot water
        	assertEquals("4704,00", sc.arrTf[15].getText());//Cena na svet
        	assertEquals(" ", sc.arrTf[14].getText());//Cena na gas
        	assertEquals(" ", sc.arrTf[16].getText());//Cena na kommunalnye uslugy       	
	}catch(Exception e){
		fail("Проверьте правильность входных занчений");
		}}}
