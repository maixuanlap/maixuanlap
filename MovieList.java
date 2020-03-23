import java.util.ArrayList;

public class MovieList {
    private  ArrayList<String> movieList = new ArrayList<>();

    public static void main(String[] args) {
        MovieList list = new MovieList();

//  Them bo phim yeu thich vao danh sach
        System.out.println("Sau đây là danh sách bộ phim yêu thích của bạn: ");
        System.out.println("-------------------------------------");
        list.addMovie("THUY HU");
        list.addMovie("TAY DU KI");
        list.addMovie("TAM QUOC DIEN NGHIA");
        list.addMovie("HONG LAU MONG");

        list.diplayList();

//   Xoa bo phim yeu thich khoi danh sach


        System.out.println("\nDanh sách mới của bạn sau khi xóa: ");
        list.removeMovie("THUY HU");
        list.diplayList();

//   Chinh sua ten phim
        System.out.println("\nDanh sách mới sau chỉnh sửa: ");
        list.setMovieList(1, "PHIM MOI");
        list.diplayList();
//   Tim kiem ten phim
        System.out.print("\nTên bô phim ban muốn tìm: ");
        list.searchMoive("HONG LAU MONG");

//    Cap nhat phim
        System.out.println("\nDanh sách phim sau khi thêm: ");
        list.updateMovie(2,"DFDFDF");
        list.diplayList();
    }

    public void addMovie(String movie){
        movieList.add(movie);
    }

    public void removeMovie(String nameMovie){
        movieList.remove(nameMovie);

    }

    public void setMovieList(int x,String nameMovie){
        movieList.set(x, nameMovie);

    }

    public void searchMoive(String nameMovie){
        System.out.println(movieList.contains(nameMovie));
    }

    public void updateMovie(int x,String nameMovie){
        movieList.add(x,nameMovie);
    }

    public void diplayList(){
        for (int i = 0;i < movieList.size();i++){
            System.out.println("Movie "+ (i+1) + " " + movieList.get(i));
        }
    }
}