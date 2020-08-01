public boolean nearHundred(int n) {
  int i = (n*-1)+100;
  i = Math.abs(i);
  if (i <= 10){
    return true;
  }
  int k = (n*-1)+200;
  k = Math.abs(k);
  if (k <= 10){
    return true;
  }
  return false;
}
