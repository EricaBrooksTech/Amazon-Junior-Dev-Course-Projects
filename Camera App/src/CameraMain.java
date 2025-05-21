
public class CameraMain {
    public static void main (String[] args) {
        Camera myFavoriteCamera = new Camera();
        myFavoriteCamera.takePicture("portrait");
        myFavoriteCamera.takePicture( 12)    ;
        myFavoriteCamera.takePicture("landscape",  24);
    }
}
