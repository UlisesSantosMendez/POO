/*
 NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
PRACTICA 3
TEMA: JAVA 3D
OPCION 3: Sistema Solar(Planetario)
FECHA DE ENTREGA: 06/05/2021

* Agregar 2 "planetas" mas y para cada "planeta"
- crear una apariencia
- cargar una textura a partir del archivo de una imagen
- poner la textura en la apariencia
- crear una esfera con el radio y la apariencia correspondiente al planeta
- rotar la esfera sobre su propio eje a la velocidad correspondiente al 
  planeta(duracion del dia)
- alejar la esfera del sol (la posicion del sol es el origen)
- rotar la esfera alrededor del sol a la velocidad correspondiente al planeta
  (duracion del anio)
- agregarla al BranchGroup
 */

import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.*;
import javax.media.j3d.*;
import java.util.*;
import javax.swing.event.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import com.sun.j3d.utils.image.TextureLoader;
import javax.swing.WindowConstants;
import javax.vecmath.*;

public class SolarSis {
    public SolarSis(){
/*
Se crean grupos, el objeto apariencia define todos los estados que pueden
ser puestos como componentes de un objeto de un nodo Shape2D
*/
        BranchGroup group = new BranchGroup();
        Appearance appsol = new Appearance();
        Appearance appmercurio = new Appearance();
        Appearance appvenus = new Appearance();
        Appearance apptierra = new Appearance();
        Appearance appluna = new Appearance();
        Appearance appmarte = new Appearance();
        Appearance appjupiter = new Appearance();
        Appearance appsaturno = new Appearance();
        Appearance appurano = new Appearance();
        Appearance appneptuno = new Appearance();
        Appearance apppluton = new Appearance();
/*
Se cargan rexturas desde una imagen con su debido formato con ayuda de
JAI IIO Tools package
*/        
        TextureLoader tex = new TextureLoader("Sol.jpg", null);
        appsol.setTexture(tex.getTexture());
        tex = new TextureLoader("Mercurio.jpg", null);
        appmercurio.setTexture(tex.getTexture());
        tex = new TextureLoader("Venus.jpg", null);
        appvenus.setTexture(tex.getTexture());
        tex = new TextureLoader("Tierra.jpg", null);
        apptierra.setTexture(tex.getTexture());
        tex = new TextureLoader("Luna.jpg", null);
        appluna.setTexture(tex.getTexture());
        tex = new TextureLoader("Marte.jpg", null);
        appmarte.setTexture(tex.getTexture());
        tex = new TextureLoader("Jupiter.jpg", null);
        appjupiter.setTexture(tex.getTexture());
        tex = new TextureLoader("Saturno.jpg", null);
        appsaturno.setTexture(tex.getTexture());
        tex = new TextureLoader("Urano.jpg", null);
        appurano.setTexture(tex.getTexture());
        tex = new TextureLoader("Neptuno.jpg", null);
        appneptuno.setTexture(tex.getTexture());
        tex = new TextureLoader("Pluton.jpg", null);
        apppluton.setTexture(tex.getTexture());
        
/*
Se crean las esferas que seran los planetas, es una figura geometrica
creada con radio y resolucion centrada al origen, se especfica que las
normales se generan junto con la posicion
*/
        Sphere sol = new Sphere(0.296f,Primitive.GENERATE_NORMALS | 
        Primitive.GENERATE_TEXTURE_COORDS, 32, appsol);
        Sphere mercurio = new Sphere(0.0243f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, appmercurio);
        Sphere venus = new Sphere(0.0605f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, appvenus);
        Sphere tierra = new Sphere(0.0637f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, apptierra);
        Sphere luna = new Sphere(0.0173f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, appluna);
        Sphere marte = new Sphere(0.0338f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, appmarte);
        Sphere jupiter = new Sphere(0.0699f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, appjupiter);
        Sphere saturno = new Sphere(0.0582f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, appsaturno);
        Sphere urano = new Sphere(0.0253f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32,appurano);
        Sphere neptuno = new Sphere(0.0246f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, appneptuno);
        Sphere pluton = new Sphere(0.0118f, Primitive.GENERATE_NORMALS |
        Primitive.GENERATE_TEXTURE_COORDS, 32, apppluton);

/*
Se hacen girar los planetas sobre su propio eje, puede posicionar, orientar,
y escalar cada uno de los hijos, a su vez se le agregara una duracion y
tiempo de incremento alpha(int loopCount, long increasingAlphaDuration)        
*/        
        TransformGroup solRotXformGroup = 
        Posi.rotate(sol, new Alpha(-1, 1250));
        TransformGroup mercurioRotXformGroup = 
        Posi.rotate(mercurio, new Alpha(-1, 1350));
        TransformGroup venusRotXformGroup = 
        Posi.rotate(venus, new Alpha(-1, 1800));
        TransformGroup tierraRotXformGroup = 
        Posi.rotate(tierra, new Alpha(-1, 1300));
        TransformGroup lunaRotXformGroup = 
        Posi.rotate(luna, new Alpha(-1, 1300));
        TransformGroup marteRotXformGroup = 
        Posi.rotate(marte, new Alpha(-1, 1250));
        TransformGroup jupiterRotXformGroup = 
        Posi.rotate(jupiter, new Alpha(-1, 1250));
        TransformGroup saturnoRotXformGroup = 
        Posi.rotate(saturno, new Alpha(-1, 1200));
        TransformGroup uranoRotXformGroup = 
        Posi.rotate(urano, new Alpha(-1,1200));
        TransformGroup neptunoRotXformGroup = 
        Posi.rotate(neptuno, new Alpha(-1, 1350));
        TransformGroup plutonRotXformGroup = 
        Posi.rotate(pluton, new Alpha(-1, 1200));
        
/*
Se aleja al sol del origen posicionando y escalando cada esfera, la clase
vector3f es un vector de tres elementos que esta representado coordenadas
singulares de presicion de un punto flotante x,y,z.
*/
        TransformGroup mercurioTransXformGroup = 
        Posi.translate(mercurioRotXformGroup, new Vector3f(0.0f, 0.0f, 0.3f));
        TransformGroup venusTransXformGroup = 
        Posi.translate(venusRotXformGroup, new Vector3f(0.0f, 0.0f, 0.5f));
        TransformGroup tierraTransXformGroup = 
        Posi.translate(tierraRotXformGroup, new Vector3f(0.0f, 0.0f, 0.6f));
        TransformGroup lunaTransXformGroup = 
        Posi.translate(lunaRotXformGroup, new Vector3f(0.0f, 0.0f, 0.6f));
        TransformGroup marteTransXformGroup = 
        Posi.translate(marteRotXformGroup, new Vector3f(0.0f, 0.0f, 0.7f));
        TransformGroup jupiterTransXformGroup = 
        Posi.translate(jupiterRotXformGroup, new Vector3f(0.0f, 0.0f, 0.95f));
        TransformGroup saturnoTransXformGroup = 
        Posi.translate(saturnoRotXformGroup, new Vector3f(0.0f, 0.0f, 1.1f));
        TransformGroup uranoTransXformGroup = 
        Posi.translate(uranoRotXformGroup, new Vector3f(0.0f, 0.0f, 1.5f));
        TransformGroup neptunoTransXformGroup = 
        Posi.translate(neptunoRotXformGroup, new Vector3f(0.0f, 0.0f, 1.9f));
        TransformGroup plutonTransXformGroup = 
        Posi.translate(plutonRotXformGroup, new Vector3f(0.0f, 0.0f, 1.95f));
        
/*
Se utiliza la clase TransformGroup para hacer rotar losplanetas esta vez
alrededor del Sol ya que en la vez anterior se rotaron en su propio eje                
*/
        TransformGroup mercurioRotGroupXformGroup = 
        Posi.rotate(mercurioTransXformGroup, new Alpha(-1, 3000));
        TransformGroup venusRotGroupXformGroup = 
        Posi.rotate(venusTransXformGroup, new Alpha(-1, 5000));
        TransformGroup tierraRotGroupXformGroup = 
        Posi.rotate(tierraTransXformGroup, new Alpha(-1, 6500));
        TransformGroup lunaRotGroupXformGroup = 
        Posi.rotate(lunaTransXformGroup, new Alpha(-1, 6500));
        TransformGroup marteRotGroupXformGroup = 
        Posi.rotate(marteTransXformGroup, new Alpha(-1, 7300));
        TransformGroup jupiterRotGroupXformGroup = 
        Posi.rotate(jupiterTransXformGroup, new Alpha(-1, 8300));
        TransformGroup saturnoRotGroupXformGroup = 
        Posi.rotate(saturnoTransXformGroup, new Alpha(-1, 8500));
        TransformGroup uranoRotGroupXformGroup = 
        Posi.rotate(uranoTransXformGroup, new Alpha(-1,8960));
        TransformGroup neptunoRotGroupXformGroup = 
        Posi.rotate(neptunoTransXformGroup, new Alpha(-1, 9000));
        TransformGroup plutonRotGroupXformGroup = 
        Posi.rotate(plutonTransXformGroup, new Alpha(-1, 9500));

/*
Usamos la clase group para agrupar nodos teniendo un padre y los
correspondientes hijos que estan en desorden y se utiliza addchild 
para especificar el nodo hijo a la lista de nodos hijos        
*/
        group.addChild(solRotXformGroup);
        group.addChild(mercurioRotGroupXformGroup);
        group.addChild(venusRotGroupXformGroup);
        group.addChild(tierraRotGroupXformGroup);
        group.addChild(lunaRotGroupXformGroup);
        group.addChild(marteRotGroupXformGroup);
        group.addChild(jupiterRotGroupXformGroup);
        group.addChild(saturnoRotGroupXformGroup);
        group.addChild(uranoRotGroupXformGroup);
        group.addChild(neptunoRotGroupXformGroup);
        group.addChild(plutonRotGroupXformGroup);
        
/*
Se usa la clase SimpleUniverse para correr y obtener rapidamente un programa
de tipo Java 3D, la clase canvas se utiliza para proporcionar un canvas que es
una zona de diseño grafico y composicion de imagenes        
*/
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas = new Canvas3D(config);
        canvas.setSize(1000,700);
        SimpleUniverse universe = new SimpleUniverse(canvas);
        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph(group);
        
/*
Se hace la ventana para agregar el canvas        
*/
        JFrame f = new JFrame("Planetario");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.add(canvas);
        f.pack();
        f.setVisible(true); 
    }
    public static void main(String[] args){
        SolarSis solar = new SolarSis();
    }
}