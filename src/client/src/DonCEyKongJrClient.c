/*#include <SDL.h>*/
#include <stdio.h>
#include <jansson.h>


int main(int argc, char *args[]) {
    json_t *outJson;
    json_error_t error;
    json_object_set_new(outJson, "pipo", json_string("piporan"));
    json_object_set_new(outJson, "pepe", json_integer(40));
    char *JsonBuf = NULL;
    JsonBuf = json_dumps(outJson, 0);
    puts(JsonBuf);
    return 0;
}