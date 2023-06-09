cmake_minimum_required(VERSION 3.25)

project(client C)

set(CMAKE_C_STANDARD 17)
set(CMAKE_C_FLAGS -pthread)

set(SOURCE_FILES
        src/DonCEyKongJrClient.c
)

set(SDL2_DIR "${PROJECT_SOURCE_DIR}/include/SDL2/cmake")
set(SDL2_DLL_LIBRARY "${PROJECT_SOURCE_DIR}/include/SDL2/lib/x64/SDL2.dll")
find_package(SDL2 REQUIRED)
include_directories(${SDL2_INCLUDE_DIRS})

if(SDL2_FOUND)
    message(STATUS "SDL2_VERSION: ${SDL2_VERSION}")
    message(STATUS "SDL2_DLL_LIBRARY: ${SDL2_DLL_LIBRARY}")
    message(STATUS "SDL2_INCLUDE_DIRS: ${SDL2_INCLUDE_DIRS}")
    message(STATUS "SDL2_LIBRARIES: ${SDL2_LIBRARIES}")
endif()

add_executable(${PROJECT_NAME} ${SOURCE_FILES})

target_link_libraries(${PROJECT_NAME} ${SDL2_DLL_LIBRARY} ${SDL2_LIBRARIES})

add_custom_command(
        TARGET ${PROJECT_NAME} POST_BUILD
        COMMAND ${CMAKE_COMMAND} -E copy_if_different
        ${SDL2_DLL_LIBRARY}
        $<TARGET_FILE_DIR:${PROJECT_NAME}>
)