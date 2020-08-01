public String everyNth(String str, int n) {
  String charlist = ("");
  for (int i = 0; i < str.length(); i = i + n){
    charlist =  charlist + str.charAt(i);
  }
  return charlist;
}
