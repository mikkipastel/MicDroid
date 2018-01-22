cmake_minimum_required(VERSION 3.4.1)

add_library(autotalent
            SHARED
            autotalent.c
            fft.c
            mayer_fft.c
            net_sourceforge_autotalent_Autotalent.c)

# Include libraries needed for autotalent lib
target_link_libraries(autotalent
                      android
                      log)