# DonCEyKongJr
video game inspired by Donkey Kong Jr from 1982.

## Descrition

In this game Mario have imprisioned Donkey Kong, so its son,
a little gorilla named Donkey Kong Jr has to rescue him.
He can walk and climb vines to avoid Mario's traps and get to his
father to set him free.

The game has a server in Java and clients in C. You can see more details about the specifications of the game in the project documentation.

RestauranTEC was developed as the third [project](docs/) of the CE3104 "Compiler and Interpreter Languages" course of the <a href="https://www.tec.ac.cr/programas-academicos/licenciatura-ingenieria-computadores">Computer Engineering</a> career, <a href="https://www.tec.ac.cr">Instituto Tecnológico de Costa Rica</a>.


## developer configuration

* Install MinGW
* Download and extract "SDL2-devel-2.26.5-mingw.tar.gz"
  from [here](https://github.com/libsdl-org/SDL/releases/tag/release-2.26.5).
* On the extracted file go to "i686-w64-mingw32/"
<p align="center">
  <img width="700" height="400" src="docs/SDL2 rute.png">
</p>

* Move all the files in "i686-w64-mingw32/" to the MinGW directory (usually "C:\MinGW") 

<p align="center">
  <img width="700" height="300" src="docs/SDL2 rute 2.png">
</p>

Now you should be able to run SDL2 using the CMakeList.txt
