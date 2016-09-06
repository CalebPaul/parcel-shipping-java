class Parcels {
  public int mHeight;
  public int mWidth;
  public int mLength;
  public int mWeight;
  public int mDistance;

public Parcels(int height, int width, int length, int weight, int distance){
  mHeight = height;
  mWidth = width;
  mLength = length;
  mWeight = weight;
  mDistance = distance;
}
public int volume(){
  return ((mHeight * mWidth * mLength)/100);
}
public int costToShip(){
return ((mDistance / 2) + mWeight);
}
}
