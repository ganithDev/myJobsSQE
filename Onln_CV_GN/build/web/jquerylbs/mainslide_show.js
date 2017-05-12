/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
!-- Begin
// Set slideShowSpeed (milliseconds)
var slideShowSpeed = 3000;
// Duration of crossfade (seconds)
var crossFadeDuration = 3;
var Pic = new Array();
// to add more images, just continue
// the pattern, adding to the array below

Pic[0] = 'images/hed4.JPG'
Pic[1] = 'images/hed5.jpg'
Pic[2] = 'images/hed3.jpg'

           
var t;
var j = 0;
var p = Pic.length;
var preLoad = new Array();
for (i = 0; i < p; i++) {
    preLoad[i] = new Image();
    preLoad[i].src = Pic[i];
}
function javaSlideShow() {
    if (document.all) {
        document.images.SlideShow.style.filter="blendTrans(duration=2)";
        document.images.SlideShow.style.filter="blendTrans(duration=crossFadeDuration)";
        document.images.SlideShow.filters.blendTrans.Apply();
    }
    document.images.SlideShow.src = preLoad[j].src;
    if (document.all) {
        document.images.SlideShow.filters.blendTrans.Play();
    }
    j = j + 1;
    if (j > (p - 1)) j = 0;
    t = setTimeout('javaSlideShow()', slideShowSpeed);
}

