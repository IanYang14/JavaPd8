class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}


  String creditCardType(String cc){
    if(cc.substring(0,1).equals("4")){
      return "Visa";
    }else if(cc.substring(0,2).equals("34")||cc.substring(0,2).equals("37")){
      return "American Express";
    }else if(cc.substring(0,2).equals("36")){
      return "Diner Club";
    }else if(cc.substring(0,2).equals("51")||cc.substring(0,2).equals("55")){
      return "Master Card";
    }else if(cc.substring(0,2).equals("65")||cc.substring(0,4).equals("6011")){
      return "Discovery";
    }else{
      return "NA";
    }
  }

  String pigLatin(String word){
    String fletter = word.substring(0,1);
    String p = word.substring(1);
    String result = p + fletter + "ay";
    return result;
  }

  String nycLocate(String zip){
    if(zip.substring(0,3).equals("101")||zip.substring(0,3).equals("100")||zip.substring(0,3).equals("102")){
      return "Manhattan";
    }else if(zip.substring(0,3).equals("103")){
      return "Staten Island";
    }else if(zip.substring(0,3).equals("104")){
      return "Bronx";
    }else if(zip.substring(0,3).equals("113")||zip.substring(0,3).equals("114")||zip.substring(0,3).equals("111")){
      return "Queens";
    }else{
      return "NA";
    }
  }
  void init(){
   System.out.println(creditCardType("44456"));
   System.out.println(pigLatin("happy"));
   System.out.println(nycLocate("11354"));
  }

  
  
}