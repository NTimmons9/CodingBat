public String frontBack(String str) {
  if (str.length() > 1){
    String last = str.substring(str.length()-1);
    String middle = str.substring(1,str.length() - 1);
    String first = str.substring(0,1);
    return last + middle + first;
  }
  return str;
}
