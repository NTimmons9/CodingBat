public String startOz(String str) {
  if (str.length() > 0){
    if (str.length() == 1){
      return str;
    }
    if (str.substring(0,1).equals("o")){
      if(str.substring(1,2).equals("z")){
        return "oz";
      }
      return "o";
    }
    if (str.substring(1,2).equals("z")){
      return "z";
    }
  }
  return "";
}
