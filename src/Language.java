/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Abstract class that contains all methods required for implementing a new language for the ATM.
 * 
 * This class must be sub-classed if you want to display a new language on the ATM. This contains methods for all of the text that is used in the UI.
 * Default language is English.
 * @author pranavkundra
 */
public abstract class Language 
{
    public Language()
    {
        
    }
    
    /**
     * 
     * @return the name of the language in the language.
     */
    abstract String languageName(); 
    
    /**
     * 
     * @return text for a  prompt to the user to choose a language for the rest of the program.
     */
    abstract String selectLanguage(); 
    
    /**
     * 
     * @return text for a label to accept account number as input from the user.
     */
    abstract String enterAccountNumberLabel();
    
    /**
     * 
     * @return text to use as a placeholder for the input field Account Number.
     */
    abstract String enterAccountNumberPlaceholder();
    
    /**
     * 
     * @return text representing the word reset.
     */
    abstract String reset();
    
    /**
     * 
     * @return text representing the words Enter PIN. 
     * PIN stands for the unique number that helps authorize the user.
     */
    abstract String enterPIN();
    
    /**
     * 
     * @return text representing the word submit.
     */
    abstract String submit();
    
    /**
     * 
     * @return text representing the number 1.
     */
    abstract String _1();
    
    /**
     * 
     * @return text representing the number 2.
     */
    abstract String _2();
    
    /**
     * 
     * @return text representing the number 3.
     */
    abstract String _3();
    
    /**
     * 
     * @return text representing the number 4.
     */
    abstract String _4();
    
    /**
     * 
     * @return text representing the number 5.
     */
    abstract String _5();
    
    /**
     * 
     * @return text representing the number 6.
     */
    abstract String _6();
    
    /**
     * 
     * @return text representing the number 7.
     */
    abstract String _7();
    
    /**
     * 
     * @return text representing the number 8.
     */
    abstract String _8();
    
    /**
     * 
     * @return text representing the number 9.
     */
    abstract String _9();
    
    /**
     * 
     * @return text representing the number 0.
     */
    abstract String _0();
    
    /**
     * 
     * @return text requesting the user to only enter a numerical account number into the input field provided.
     */
    abstract String numericalAccountNumberMessage();
    
    /**
     * 
     * @return text representing the words Invalid Account Number.
     */
    abstract String invalidAcNo();
    
    /**
     * 
     * @return text representing the words Incorrect PIN.
     * PIN stands for the unique number that helps authorize the user.
     */
    abstract String incorrectPIN();
    
    /**
     * 
     * @return text representing the word Welcome
     */
    abstract String welcome();
    
    /**
     * 
     * @return text representing exclamation mark
     */
    abstract String exclamation();
    
    /**
     * 
     * @return text representing full stop
     */
    abstract String fullStop();
    
    /**
     * 
     * @return text representing the words Check Balance.
     * Here balance refers to amount of money remaining in the account.
     */
    abstract String checkBalance();
    
    /**
     * 
     * @return text representing the word Withdraw
     */
    abstract String withdraw();
    
    /**
     * 
     * @return text representing the word Deposit
     */
    abstract String deposit();
    
    /**
     * 
     * @return text representing the word Exit
     */
    abstract String exitATM();
    
    /**
     * 
     * @return text that informs the user about the balance remaining in his account
     */
    abstract String balanceMessage();
    
    /**
     * 
     * @return text representing a prompt asking the user to enter deposit amount
     */
    abstract String depositPrompt();
    
    /**
     * 
     * @return text displaying a message that amount entered for deposit is invalid.
     */
    abstract String invalidDeposit();
    
    /**
     * 
     * @return text representing a prompt asking the user to enter withdrawal amount
     */
    abstract String withdrawalPrompt();
    
    /**
     * 
     * @return text displaying a message that amount entered for withdrawal is invalid.
     */
    abstract String invalidWithdrawal();
    
    /**
     * 
     * @return text displaying a message that amount entered for withdrawal is in excess of funds in account
     */
    abstract String excessWithdrawal();
    
    /**
     * The function converts a given English number to the language equivalent
     * 
     * @return the equivalent of the English number in the particular language
     */
    abstract String convertEnglishNumber(String number);
}
