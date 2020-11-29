#include <Adafruit_NeoPixel.h>

#define SIZE 5

Adafruit_NeoPixel pixel(25, 6, NEO_GRB + NEO_KHZ800);

byte bytes[SIZE];

void setup() {
  pixel.begin();
  pixel.show();
  Serial.begin(9600);
}

void loop() {}

void serialEvent() {
  if (Serial.available() >= SIZE) {
    Serial.write(Serial.available());
    Serial.readBytes(bytes, SIZE);
    Serial.write(bytes, SIZE);
    pixel.fill(pixel.Color(bytes[0], bytes[1], bytes[2]), bytes[3], bytes[4]);
    pixel.show();
  }
}
