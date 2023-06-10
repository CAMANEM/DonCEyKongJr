package utils;

public interface Constants {

    // Game

    Integer GAME_PLAYERS_MAX = 2;
    Integer GAME_OBSERVERS_MAX = 2;
    Integer[] GAME_WINDOW_SIZE = {600, 500}; // GAME_WINDOW_SIZE = {w, h}

    // Player
    Integer PLAYER_HEALTH_MIN = 1; // PLAYER_HEALTH_MIN > 1


    // Junior

    Integer JUNIOR_NORMAL_SPEED = 2; // JUNIOR_NORMAL_SPEED > 2
    Integer JUNIOR_HANGING_SPEED = 4; // JUNIOR_HANGING_SPEED > JUNIOR_NORMAL_SPEED
    Integer[] JUNIOR_RECT = {25, 500, 0, 0}; // JUNIOR_RECT = {x, y, w, h}
    String JUNIOR_IDLE_SPRITE = "";
    String JUNIOR_JUMPING_LEFT_SPRITE = "";
    String JUNIOR_JUMPING_RIGHT_SPRITE = "";
    String JUNIOR_RUNNING_LEFT_SPRITE = "";
    String JUNIOR_RUNNING_RIGHT_SPRITE = "";
    String JUNIOR_HANGING_SPRITE = "";
    String JUNIOR_HANGING_LEFT_SPRITE = "";
    String JUNIOR_HANGING_RIGHT_SPRITE = "";


    // Map

    Integer VINE_MAX = 11;
    Integer[] VINE_RECT = {0, 0, 2, 40}; // VINE_RECT = {x, y, w, h}
    String VINE_SPRITE = "";

    Integer TRUNK_MAX = 6;
    Integer[] TRUNK_RECT = {0, 0, 40, 5}; // TRUNK_RECT = {x, y, w, h}
    String TRUNK_SPRITE = "";

    Integer LAND_MAX = 5;
    Integer[] LAND_RECT = {0, 0, 30, 10}; // LAND_RECT = {x, y, w, h}
    String LAND_SPRITE = "";


    // Fruit

    Integer FRUIT_FALL_SPEED = 3;

    Integer[] APPLE_RECT = {0, 0, 10, 10}; // APPLE_RECT = {x, y, w, h}
    String FRUIT_APPLE_SPRITE = "";

    Integer[] BANANA_RECT = {0, 0, 5, 15}; // BANANA_RECT = {x, y, w, h}
    String FRUIT_BANANA_SPRITE = "";

    Integer[] ORANGE_RECT = {0, 0, 10, 10}; // ORANGE_RECT = {x, y, w, h}
    String FRUIT_ORANGE_SPRITE = "";


    // Snapjaw

    Integer SNAPJAW_SPEED_MIN = 3; // SNAPJAW_SPEED_MIN > JUNIOR_NORMAL_SPEED
    Integer[] SNAPJAW_RECT = {100, 150, 10, 10}; // SNAPJAW_RECT = {x, y, w, h}

    String SNAPJAW_FALLING_DOWN_SPRITE = "";
    String SNAPJAW_FALLING_LEFT_SPRITE = "";
    String SNAPJAW_FALLING_RIGHT_SPRITE = "";

    String SNAPJAW_HANGING_UP_SPRITE = "";
    String SNAPJAW_HANGING_DOWN_SPRITE = "";
    String SNAPJAW_HANGING_LEFT_SPRITE = "";
    String SNAPJAW_HANGING_RIGHT_SPRITE = "";


    // Server

    String ASCII_NAME =
            """
                        ██████╗  █████╗ ███╗  ██╗ █████╗ ███████╗██╗   ██╗\t\t██╗  ██╗ █████╗ ███╗  ██╗ ██████╗ \t\t     ██╗██████╗\s
                        ██╔══██╗██╔══██╗████╗ ██║██╔══██╗██╔════╝╚██╗ ██╔╝\t\t██║ ██╔╝██╔══██╗████╗ ██║██╔════╝ \t\t     ██║██╔══██╗
                        ██║  ██║██║  ██║██╔██╗██║██║  ╚═╝█████╗   ╚████╔╝ \t\t█████═╝ ██║  ██║██╔██╗██║██║  ██╗ \t\t     ██║██████╔╝
                        ██║  ██║██║  ██║██║╚████║██║  ██╗██╔══╝    ╚██╔╝  \t\t██╔═██╗ ██║  ██║██║╚████║██║  ╚██╗\t\t██╗  ██║██╔══██╗
                        ██████╔╝╚█████╔╝██║ ╚███║╚█████╔╝███████╗   ██║   \t\t██║ ╚██╗╚█████╔╝██║ ╚███║╚██████╔╝\t\t╚█████╔╝██║  ██║
                        ╚═════╝  ╚════╝ ╚═╝  ╚══╝ ╚════╝ ╚══════╝   ╚═╝   \t\t╚═╝  ╚═╝ ╚════╝ ╚═╝  ╚══╝ ╚═════╝ \t\t ╚════╝ ╚═╝  ╚═╝
                    """;

    String ASCII_SERVER =
            """
                        \t\t\t\t\t\t ██████╗███████╗██████╗ ██╗   ██╗███████╗██████╗\s
                        \t\t\t\t\t\t██╔════╝██╔════╝██╔══██╗██║   ██║██╔════╝██╔══██╗
                        \t\t\t\t\t\t╚█████╗ █████╗  ██████╔╝╚██╗ ██╔╝█████╗  ██████╔╝
                        \t\t\t\t\t\t ╚═══██╗██╔══╝  ██╔══██╗ ╚████╔╝ ██╔══╝  ██╔══██╗
                        \t\t\t\t\t\t██████╔╝███████╗██║  ██║  ╚██╔╝  ███████╗██║  ██║
                        \t\t\t\t\t\t╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝
                    """;

    String ASCII_JUNIOR =
            """
                                        ▄███▄
                                        █▌▒▒██████▌
                                        █▌▒▒▒▄▄▄▄█▌
                                        █▌▒▒██▄▄▄▄▄
                                        █▌▒▒▒▒▒▒▒██
                                     ▄▄▄█▌▒▒███████
                                  ██▀▀░▄██▒▒█████▄
                                 █▌░░██▀▀▀▀█████████
                                 ██░░░▄████▀▀░░░░░░▀█
                                  █████░█▌█░░░█▌░░░░▐█
                                  █▒▐██░░▀▒▄██▀░░░░░▐█
                                  ██▄▀███████░░░░░░░▓█
                                  █▒▀▀▀█████▒░░░░░░░█▌
                                  ▀██▄▄▄▄████░░░░░░█▀
                                    █▌▀▀░░░████░░▄███        ▄▄▄▄▄▄▄
                                     ▀█████▒███▒▒█▒▒█▌   ▄███▒▒▒▒▒▒▓███▄
                                   ▄█████▌▒▒██████▒▒▒█ ▄█▀▒▒▒▒▒▒▒▒▒▒▒▒▒▀██▄▄
                                  ▐█▒▒██▒▒▒▒▒▒██▒██▒████▒▒▒▄█████▒▒▒▒▒▒▒▒▒▒███▄
                                   ██▒▒▒▒▒▒▒▒▒▒▒▒██████████▀░░░ ▀██▓▒▒▒▓█████████▄
                                    ▀▀▀█▒▒██▒▓██▀▒▒▓█▌▄░▀▀▄████▄░░██▌▒██▀▀▄▄▀▀██▒███▄
                                        ██████▒▒▒▒███▀▀▀██▀   ▀█▌░░█▌██▒██▓██░████████▄
                                          ▐█▒▒▒▒▒█▀▐█ ▄█▄▄███  ▐█░▐█████████████▄▄    ▀█▄
                                           ██▒▒▒▒█▌░█▄█▌▀▀▄█████▌░▐███▒▒▒▒▒▒▒▒▒▒▀██▄    ▀█▄
                                            ██▒▒▒▒███▀▀▀██▀▒░░▐█░▄██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▄    ▀█▄
                                             ▀██▒▓███▌▀█░░█▀░░▀░▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███     ██
                                               ▀██░░░░░░░░░░░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▌     ██
                                               ▐█░░░░░░█░░░░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒██      ██
                                              ▐██░░░░░░█░░░░░░░██▒▒▒▒▒▒▒▒▒▒▒▓██▒▒▒▒▒▒▒██       ██
                                              ▐█▄░░░░░░░░░░░░░▓█▌▒▒▒▒▒▒▒▒▒▒▒███▒▒▒▒▒▒▒██        █▌
                                                ▀▀███████████▀██▌▒▒▒▒▒▒▒▒▒▒▒██▌▒▒▒▒▒▒███        ▐█
                                                   ▀██▄░░░░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▓█▌▒▒▒▒▒▓██          ██
                                                      ▀▀███▄▄▄██▒▒▒▒▒▒▒▒▒▒▒▒▓██▒▒▒████            █▌
                                                         ▀█▌  ██▒▒▒▒▒▒▒▒▒▒▒▒▒█████▀▀▀▄▄▄          ██
                                                          ▀██▄██▒▒▒▒▒▒▒▒▒▒▒▒▒███▓████▓▒▓█          █▌
                                                             ▀██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▓███         ██▄▄▄
                                                          ▄▄████▒▒▒▒▒▒▒▒▒▒▒▒▒██████▌▒▒▓█▄      ▄████▀▀▀▀▀████
                                                        ▄██▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒███  █▓▒▒▒▓█▄   ▄██▓▒▒▒▒▒▒▒▒▒▒▒██
                                                       ▄█▌▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒███████▓▒▒▒▓█  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▌
                                                       ▐█▌▒▒▒▒██▌▒▒▒▒▒▒▒▒▒▒▒▒███▒▒▒▓▓▒▒▒██ ██▒▒████▀▒▒▒▒▒▒▒▒▒█
                                                        ██▒▒▒▒▓██▒▓█▒▒▒▓▒▒▒▒▒███▓▒▒▒▒▒██▀  █████▀▒▒▒▒▒▒▒▒▒▒▒█▌
                                                         ▀██▒▒▒██▒▒██▓▒███▒▒▒██▄▄▓▀▀▀▀▄▄▄▄████▒▒▒▒▒▒▒▒▒▒▒▒██▀
                                                           ▀██▓████░░▀▀▀▀▀▀▀▀██▀▀▀▀▀▀▀▀▀▀▐██▒▒▒▒▒▒▒▒▒▒▒▒██▀
                                                          ▄▄▄████▌░░░░░░░░░░░░█▄         ██▄▒▒▒▒▄▄▒▒▒███▀
                                                       ▄██▓██▀███░░░░░░░░░░░░░██       ▄█▀░░▀█▀▀▀██▀██▀█▄
                                                       ██████████░░█░░█░░█▌░▄██     █▀▀█░░▄▄░▄█▌░▓█░▐█░░█
                                                          ▀▀▀▀▀██▄██░░█▒░█▌░▒███   ▐██▓▄▄█▀  ██▓███▓████
                    """;
}
