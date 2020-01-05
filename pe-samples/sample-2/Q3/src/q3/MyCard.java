/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author Kudo
 */
public class MyCard {

    String cardNumber;
    String cardType;

    public MyCard(String ctype, String cnumber) {
        this.cardType = ctype;
        for(int i = 0; i < cnumber.length(); i++){
            if(!(Character.isLetter(cnumber.charAt(i)))){
                this.cardNumber = "0000";
            }
        }
        this.cardNumber = cnumber;
    }

    public String getCardCode() {
        if(cardType.equals("credit")){
            return cardNumber.substring(cardNumber.length() - 4, cardNumber.length());
        }else{
        return cardNumber.substring(1, 5);
        }
    }

    @Override
    public String toString() {
        return this.cardType + " " + this.cardNumber;
    }

}
