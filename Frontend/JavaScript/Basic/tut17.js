console.log("This is tutorial 17 on events");

document.getElementById("heading").addEventListener("click", function (e) {
  let variable;
  console.log("You have clicked the heading");

  variable = e.altKey;
  // It will return whether the "ALT" key was pressed when the mouse event was triggered.

  variable = e.button;
  // It will return which mouse button was pressed when the mouse event was triggered.

  variable = e.charCode;
  // It will return which mouse button was pressed when the mouse event was triggered.

  variable = e.clientX;
  // It will return the horizontal coordinate of the mouse pointer, relative to the current window, when the mouse event was triggered.

  variable = e.clientY;
  // It will return the vertical coordinate of the mouse pointer, relative to the current window, when the mouse event was triggered.

  variable = e.code;
  // It will return the code of the key that triggered the event.

  variable = e.deltaX;
  // It will return the horizontal scroll amount of a mouse wheel (x-axis).

  variable = e.deltaY;
  // It will return the vertical scroll amount of a mouse wheel (y-axis).

  variable = e.deltaZ;
  // It will return the scroll amount of a mouse wheel for the z-axis.

  variable = e.detail;
  // It will return a number that indicates how many times the mouse was clicked

  variable = e.keyCode;
  // It will return the Unicode character code of the key that triggered the
  // onkeypress event, or the Unicode key code of the key that triggered the
  //onkeydown or onkeyup event.

  variable = e.location;
  // It will return the location of a key on the keyboard or device.

  variable = e.pageX;
  // It will return the horizontal coordinate of the mouse pointer, relative to the document, when the mouse event was triggered.

  variable = e.pageY;
  // It will return the vertical coordinate of the mouse pointer, relative to the document, when the mouse event was triggered.

  variable = e.screenX;
  // It will return the horizontal coordinate of the mouse pointer, relative to the screen, when an event was triggered.

  variable = e.screenY;
  // It will return the vertical coordinate of the mouse pointer, relative to the screen, when an event was triggered.

  variable = e.shiftKey;
  // It will return whether the "SHIFT" key was pressed when an event was triggered.

  variable = e.type;
  // It will return the name of the event.

  variable = e.which;
  // It will return which mouse button was pressed when the mouse event was triggered.

  variable = e.view;
  // It will return a reference to the Window object where the event occurred

  variable = e.target;

  variable = e.target.className;

  variable = Array.from(e.target.classList);

  variable = e.target.id;

  variable = e.offsetX;

  variable = e.offsetY;

  console.log(variable);
  // location.href = '//NewtonSchool.co/S'
});
