package org.docksidestage.javatry.basic.st6.os;

public class St6OSWindows extends St6OperationSystem{
    public St6OSWindows(String loginId) {
        super(loginId);
    }
    @Override
    public String getFileSeparator(){
        return "\\";
    }

    @Override
    public String getUserDirectory(){
        return "/Users/" + loginId;
    }
}
