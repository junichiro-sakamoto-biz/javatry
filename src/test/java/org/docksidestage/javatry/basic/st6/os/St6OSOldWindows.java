package org.docksidestage.javatry.basic.st6.os;

public class St6OSOldWindows extends St6OperationSystem{
    public St6OSOldWindows(String loginId) {
        super(loginId);
    }

    @Override
    public String getFileSeparator(){
        return "\\";
    }

    @Override
    public String getUserDirectory(){
        return "/Documents and Settings/" + loginId;
    }
}
