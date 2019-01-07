public class Tile{

  private String color;
  private boolean planeHere;
  private boolean dangerZone;
  private boolean shortcut;
  private int numPlanes;
  private boolean launchingTile;

  public Tile(String color){
    planeHere = false;
    numPlanes = 0;
  }

  public void setPlaneHere(boolean b){
    planeHere = b;
  }

  public void setDangerZone(boolean b){
    dangerZone = b;
  }

  public void setShortcut(boolean b){
    shortcut = b;
  }

  public void setLaunchingTile(boolean b){
    launchingTile = b;
  }

  public void addPlanes(int n){
    numPlanes += n;
  }

  public String getColor(){
    return color;
  }

  public boolean isPlaneHere(){
    return planeHere;
  }

  public boolean isDangerZone(){
    return dangerZone;
  }

  public boolean isShortcut(){
    return shortcut;
  }

  public boolean isLaunchingTile(){
    return launchingTile;
  }

  public int getNumPlanes(){
    return numPlanes;
  }

}
