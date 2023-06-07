cmake_minimum_required(VERSION 3.25)
project(client C)
set(CMAKE_C_STANDARD 17)

#set(CMAKE_MODULE_PATH ${PROJECT_SOURCE_DIR}/cmake)
#set(CMAKE_MODULE_PATH "${CMAKE_SOURCE_DIR}src/dependencies/SDL2-2.26.5/i686-w64-mingw32" ${CMAKE_MODULE_PATH})
#find_package(SDL2 REQUIRED)
set(SDL2_PATH "src/dependencies/SDL2-2.26.5/i686-w64-mingw32")


set(SDL2_INCLUDE_DIR "src/dependencies/SDL2-2.26.5/i686-w64-mingw32/include/SDL2")
set(SDL2_LIBRARY_DIR "src/dependencies/SDL2-2.26.5/i686-w64-mingw32/lib")
set(SDL2_DIR "src/dependencies/SDL2-2.26.5/i686-w64-mingw32/lib/cmake/SDL2")
#set(CMAKE_MODULE_PATH "src/dependencies/SDL2-2.26.5/cmake" ${CMAKE_MODULE_PATH})

if(SDL2_FOUND)
    message(STATUS "SDL2_INCLUDE_DIR: ${SDL2_INCLUDE_DIR}")
    message(STATUS "SDL2_LIBRARIES: ${SDL2_LIBRARIES}")
    message(STATUS "SDL2_VERSION: ${SDL2_VERSION}")
endif()

link_directories(SDL2_LIBRARY_DIR)
include_directories(SDL2_INCLUDE_DIR)
include_directories(src)

find_package(SDL2 REQUIRED)
#find_package(SDL2_image REQUIRED)
#find_package(SDL2_ttf REQUIRED)


add_executable(client src/main.c)

include_directories(${SDL2_INCLUDE_DIR}
        ${SDL2_IMAGE_INCLUDE_DIR}
        ${SDL2_MIXER_INCLUDE_DIR}
        )
target_link_libraries(client ${SDL2_LIBRARY}
        ${SDL2_IMAGE_LIBRARY}
        ${SDL2_MIXER_LIBRARY}
        -lmingw32 -lSDL2main -lSDL2)