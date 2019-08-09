/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.facade;

/**
 *
 * @author carlozandrez
 */
public class FachadaLibreria {
    private LibreriaLibros libros = new LibreriaLibros();
    private LibreriaMusica musica = new LibreriaMusica();
    private LibreriaVideos videos = new LibreriaVideos();
    
    public String buscarLibros(){
        return libros.buscarLibros();
    }
    
    public String buscarMusica(){
        return musica.buscarMusica();
    }
    
    public String buscarVideos(){
        return videos.buscarVideos();
    }
}
