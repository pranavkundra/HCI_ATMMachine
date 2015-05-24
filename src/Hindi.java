/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranavkundra
 */
public class Hindi extends Language
{   
    @Override
    String languageName() {
        return "हिन्दी";
    }

    @Override
    String selectLanguage() {
        return "भाषा चुनियें।";
    }

    @Override
    String enterAccountNumberLabel() {
        return "खाता नंबर";
    }

    @Override
    String enterAccountNumberPlaceholder() {
        return "खाता नंबर यहां टाइप करें।";
    }

    @Override
    String reset() {
        return "मिटाऍं";
    }

    @Override
    String enterPIN() {
        return "सुरक्षा कोड";
    }

    @Override
    String submit() {
        return "प्रगति करें";
    }

    @Override
    String _1() {
        return "१";
    }

    @Override
    String _2() {
        return "२";
    }

    @Override
    String _3() {
        return "३";
    }

    @Override
    String _4() {
        return "४";
    }

    @Override
    String _5() {
        return "५";
    }

    @Override
    String _6() {
        return "६";
    }

    @Override
    String _7() {
        return "७";
    }

    @Override
    String _8() {
        return "८";
    }

    @Override
    String _9() {
        return "९";
    }

    @Override
    String _0() {
        return "०";
    }

    @Override
    String numericalAccountNumberMessage() {
        return "कृपया यह क्षेत्र में केवल संख्यात्मक अंक टाइप करें।";
    }

    @Override
    String invalidAcNo() {
        return "खाता नंबर गलत है।";
    }

    @Override
    String incorrectPIN() {
        return "सुरक्षा कोड गलत है।";
    }

    @Override
    String welcome() {
        return "सुस्वागतम";
    }
    
    @Override
    String exclamation() {
        return "!";
    }

    @Override
    String checkBalance() {
        return "शेष धन देखैं";
    }

    @Override
    String withdraw() {
        return "धन निकाले";
    }

    @Override
    String deposit() {
        return "धन जमा करें";
    }

    @Override
    String exitATM() {
        return "निकास";
    }

    @Override
    String balanceMessage() {
        return "आपके खाते में पैसे है ₹ ";
    }

    @Override
    String depositPrompt() {
        return "धन जमा करने की संख्या टाइप करें।";
    }

    @Override
    String invalidDeposit() {
        return "धन जमा करने की संख्या गलत है!";
    }

    @Override
    String withdrawalPrompt() {
        return "धन निकालने की संख्या टाइप करें।";
    }

    @Override
    String invalidWithdrawal() {
        return "धन निकालने की संख्या गलत है!";
    }

    @Override
    String excessWithdrawal() {
        return "आपके खाते में पैसे टाइप की गयी संख्या से कम है!";
    }

    @Override
    String convertEnglishNumber(String number) {
        String newNumber="";
        char b;
        
        for(int i=0;i<number.length();i++)
        {
            b=number.charAt(i);
            
            switch(b)
            {
                case '0':
                    newNumber+=_0();
                    break;
                    
                case '1':
                    newNumber+=_1();
                    break;
                    
                case '2':
                    newNumber+=_2();
                    break;
                    
                case '3':
                    newNumber+=_3();
                    break;
                    
                case '4':
                    newNumber+=_4();
                    break;
                    
                case '5':
                    newNumber+=_5();
                    break;
                    
                case '6':
                    newNumber+=_6();
                    break;
                    
                case '7':
                    newNumber+=_7();
                    break;
                    
                case '8':
                    newNumber+=_8();
                    break;
                    
                case '9':
                    newNumber+=_9();
                    break;
                        
                default:     
                    newNumber="Error";
                    break;
            }
        }
        
        return newNumber;
    }

    @Override
    String fullStop() {
        return "।";
    }
    public static void main(String [] args)
    {
        String s="स्वागत";
        System.out.println("स्वागत");
        
        System.out.println("\u092E\u0947\u0902");
        
        
//        for(char c =0x0966; c<=0x096F; c++)
//        {
//            System.out.println(Integer.toHexString((int)c) + " " + c);
//        }
    }
}
