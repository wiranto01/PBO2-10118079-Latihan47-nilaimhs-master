/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan47.nilaimahasiswa;

/**
 *
 * @author User
 */
public class rumus {
 private double quiz,uts,uas,nilaiakhir;
 public String index,keterangan;

    rumus(double quiz, double uts, double uas) {
        this.quiz=quiz;
        this.uts=uts;
        this.uas=uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        
        return uas;
    }

    public double getNilaiakhir() {
        return nilaiakhir = (quiz*0.2)+(uts*0.3)+(uas*0.5);
    }

    private String getIndex(double na) {
        
        if(na>=80&&na<100)return "A";
        else if(na>=68&&na<80)return "B";
        else if(na>=56&&na<68)return "C";
        else if(na>=45&&na<56)return "D";
        else return "E";
        
        
    }

    private String getKeterangan(String index) {
      String ket;
      switch(index){
          case "A":ket = "SANGAT BAGUS";break;
              case "B":ket = "BAIK";break;
                  case "C":ket = "CUKUP";break;
                      case "D":ket = "KURANG";break;
                          default:ket ="SANGAT KURANG";break;
                  
      }
       return ket;
    }
    public void tampil() {
        double na=getNilaiakhir();
        System.out.println("QUIZ ="+quiz);
        System.out.println("UTS ="+uts);
        System.out.println("UAS ="+uas);
        System.out.println("NILAI AKHIR ="+getNilaiakhir());
        System.out.println("INDEK ="+getIndex(na));
        System.out.println("KETERANGAN ="+getKeterangan(getIndex(na)));
        System.out.println("");
    }
}              
          
    
 
     
    
    
    
    
    
    
    


        