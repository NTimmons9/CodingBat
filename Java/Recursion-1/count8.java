public int count8(int n) {
  if (n == 0){
    return 0;
  }
  if (n % 10 == 8){
    int count = 0;
    if ((n / 10) % 10 == 8){
      count = 8;
    }
    if (count != 8){
      count = 0;
      return 1 + count8(n / 10);
    }
    if (count == 8){
      count = 8;
      return 2 + count8(n / 10);
    }
  }
  return count8(n / 10);
}
