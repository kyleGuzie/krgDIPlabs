/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSProject;

/**
 *
 * In-class POS sale system
 * 10-2-12
 * 
 * @author Kyle Guzikowski
 * @version 1.00
 */
public class Customer {
    private String custName;
    private String custNumber;
    private String custAddress;
    private boolean rewardsMember = false;
    
    public final boolean isRewardsMember(boolean rewards){
        return rewardsMember = rewards;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }
    
    
    
    
    
    
    
    
    
}
