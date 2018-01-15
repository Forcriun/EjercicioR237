import java.util.ArrayList;

public class EjercicioR237
{    
    public int puntuacionPalabra(String palabra)
    {
        int inicioSubstring = 0;
        int finSubstring = 1;
        int puntuacion = 0;
        while(inicioSubstring < palabra.length()){
            if(palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(A|a|E|e|I|i|O|o|U|u|L|l|N|n|R|r|S|s|T|t|)")){
                puntuacion++;
            }
            if(palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(D|d|G|g)")){
                puntuacion += 2;
            }
            if(palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(B|b|C|c|M|m|P|p)")){
                puntuacion += 3;
            }
            if(palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(F|f|H|h|V|v|W|w|Y|y)")){
                puntuacion += 4;
            }
            if(palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(K|k)")){
                puntuacion += 5;
            }
            if(palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(J|j|X|x)")){
                puntuacion += 8;
            }
            if(palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(Q|q|Z|z)")){
                puntuacion += 10;
            }
            inicioSubstring++;
            finSubstring++;
        }
        return puntuacion;
    }

    public int puntuacionPalabraTernario(String palabra)
    {
        int inicioSubstring = 0;
        int finSubstring = 1;
        int puntuacion = 0;        
        while(inicioSubstring < palabra.length()){
            puntuacion = (palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(A|a|E|e|I|i|O|o|U|u|L|l|N|n|R|r|S|s|T|t|)"))? puntuacion+= 1:puntuacion;
            puntuacion = (palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(D|d|G|g)"))? puntuacion+= 2:puntuacion;
            puntuacion = (palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(B|b|C|c|M|m|P|p)"))? puntuacion+= 3:puntuacion;
            puntuacion = (palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(F|f|H|h|V|v|W|w|Y|y)"))? puntuacion+= 4:puntuacion;
            puntuacion = (palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(K|k)"))? puntuacion+= 5:puntuacion;
            puntuacion = (palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(J|j|X|x)"))? puntuacion+= 8:puntuacion;
            puntuacion = (palabra.toLowerCase().substring(inicioSubstring,finSubstring).matches("(Q|q|Z|z)"))? puntuacion+= 10:puntuacion;
            inicioSubstring++;
            finSubstring++;
        }
        return puntuacion;
    }

    public int puntuacionPalabraSwitch(String palabra)
    {
        // Escribe tu código a continuación...
        int puntuacion = 0;
        for (int i = 0; i < palabra.length(); i++){
            char letraAnalizada = palabra.charAt(i);
            switch (letraAnalizada) {
                case 'A': case 'E': case 'I': case 'L': case 'N':
                case 'O': case 'R': case 'S': case 'T': case 'U':
                puntuacion +=1; break;
                case 'D': case 'G':
                puntuacion +=2; break;
                case 'B': case 'C': case 'M': case 'P':
                puntuacion +=3; break;
                case 'F': case 'H': case 'V': case 'W': case 'Y':
                puntuacion +=4; break;
                case 'K':
                puntuacion +=5; break;
                case 'J': case 'X':
                puntuacion +=8; break;
                case 'Q': case 'Z':
                puntuacion +=10; break;
                default: break;
            }
        }
        return puntuacion;
    }

    public int puntuacionPalabraPrueba(String palabra)
    {
        // Escribe tu código a continuación...
        int a = 0;
        int b = 0;
        int c = 1;
        int x = 0;
        int puntuacion = 0;
        ArrayList<String> word = new ArrayList<>();
        while(a < palabra.length()){
            word.add(palabra.substring(b,c));
            a++;
            b++;
            c++;
        }
        System.out.println(word);
        while(x < word.size()){
            if(word.get(x).matches("(A|a|E|e|I|i|O|o|U|u|L|l|N|n|R|r|S|s|T|t|)")){
                puntuacion++;
            }
            if(word.get(x).matches("(D|d|G|g)")){
                puntuacion += 2;
            }
            if(word.get(x).matches("(B|b|C|c|M|m|P|p)")){
                puntuacion += 3;
            }
            if(word.get(x).matches("(F|f|H|h|V|v|W|w|Y|y)")){
                puntuacion += 4;
            }
            if(word.get(x).matches("(K|k)")){
                puntuacion += 5;
            }
            if(word.get(x).matches("(J|j|X|x)")){
                puntuacion += 8;
            }
            if(word.get(x).matches("(Q|q|Z|z)")){
                puntuacion += 10;
            }
            x++;
        }
        return puntuacion;
    }
}