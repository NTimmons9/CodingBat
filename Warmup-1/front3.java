public String front3(String str) {
  if (str.length() < 3){
    return str + str + str;
  }
  String first = str.substring(0,3);
  return first + first + first;
}
