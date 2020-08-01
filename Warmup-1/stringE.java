public boolean stringE(String str) {
  int ecount = 0;
  for (int i = 0; i < str.length(); i++){
    char a = str.charAt(i);
    if (a == ('e')){
      ecount = ecount + 1;
    }
  }
  if ((ecount >= 1) && (ecount <= 3)){
    return true;
  }
  return false;
}
