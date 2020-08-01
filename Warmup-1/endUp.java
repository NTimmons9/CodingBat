public String endUp(String str) {
  if (str.length() < 3){
    str = str.toUpperCase();
    return str;
  }
  String first = str.substring(0, str.length() - 3);
  String last = str.substring(str.length() - 3, str.length());
  last = last.toUpperCase();
  return first + last;
}
