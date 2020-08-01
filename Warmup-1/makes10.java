public boolean makes10(int a, int b) {
  int i = a + b;
  if (i == 10){
    return true;
  }
  else if ((a == 10) || (b == 10)){
    return true;
  }
  return false;
}
