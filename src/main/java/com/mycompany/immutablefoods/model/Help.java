/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class Help {
    private String helpid;
    private String question;
    
    private Help(){}
    public Help(Builder build){
     helpid=build.helpid;
     question =build.question;
    }
    
    public static class Builder{
     private String helpid;
     private String question;
     
     public Builder helpid(String id){
     helpid=id;
     return this;
     }
     public Builder question(String q){
     question= q;
     return this;
     }
     public Help build(){
     return new Help();
     }
}

    public String getHelpid() {
        return helpid;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.helpid != null ? this.helpid.hashCode() : 0);
        hash = 97 * hash + (this.question != null ? this.question.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Help other = (Help) obj;
        if ((this.helpid == null) ? (other.helpid != null) : !this.helpid.equals(other.helpid)) {
            return false;
        }
        if ((this.question == null) ? (other.question != null) : !this.question.equals(other.question)) {
            return false;
        }
        return true;
    }
    
    
}
