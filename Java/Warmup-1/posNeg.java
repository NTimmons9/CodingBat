public boolean posNeg(int a, int b, boolean negative) {
  if (((a < 0) ^ (b < 0) && (!negative)) || ((negative) && (a < 0) && (b < 0))){
    return true;
  }
  return false;
}
