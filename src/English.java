/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranavkundra
 */
public class English extends Language
{

    public English() 
    {
        super();
    }

    @Override
    String languageName() {
        return "English";
    }

    @Override
    String selectLanguage() {
        return "Select Language!";
    }

    @Override
    String enterAccountNumberLabel() {
        return "Enter Account Number";
    }

    @Override
    String enterAccountNumberPlaceholder() {
        return "Enter Account Number here...";
    }

    @Override
    String reset() {
        return "Reset";
    }

    @Override
    String enterPIN() {
        return "Enter PIN";
    }

    @Override
    String submit() {
        return "Submit";
    }

    @Override
    String _1() {
        return "1";
    }

    @Override
    String _2() {
        return "2";
    }

    @Override
    String _3() {
        return "3";
    }

    @Override
    String _4() {
        return "4";
    }

    @Override
    String _5() {
        return "5";
    }

    @Override
    String _6() {
        return "6";
    }

    @Override
    String _7() {
        return "7";
    }

    @Override
    String _8() {
        return "8";
    }

    @Override
    String _9() {
        return "9";
    }

    @Override
    String _0() {
        return "0";
    }

    @Override
    String numericalAccountNumberMessage() {
        return "Please enter only a numerical account number";
    }

    @Override
    String invalidAcNo() {
        return "Invalid Account Number";
    }

    @Override
    String incorrectPIN() {
        return "PIN incorrect!";
    }

    @Override
    String welcome() {
        return "Welcome";
    }
    
    @Override
    String exclamation() {
        return "!";
    }

    @Override
    String checkBalance() {
        return "Check Balance";
    }

    @Override
    String withdraw() {
        return "Withdraw";
    }

    @Override
    String deposit() {
        return "Deposit";
    }

    @Override
    String exitATM() {
        return "Exit";
    }

    @Override
    String balanceMessage() {
        return "Your balance is ₹ ";
    }

    @Override
    String depositPrompt() {
        return "Enter the deposit amount";
    }

    @Override
    String invalidDeposit() {
        return "Invalid Deposit Amount!";
    }

    @Override
    String withdrawalPrompt() {
        return "Enter the withdrawal amount";
    }

    @Override
    String invalidWithdrawal() {
        return "Invalid Withdrawal Amount!";
    }

    @Override
    String excessWithdrawal() {
        return "Insufficient Funds for Withdrawal!";
    }

    @Override
    String convertEnglishNumber(String number) {
        return number;
    }

    @Override
    String fullStop() {
        return ".";
    }
}
