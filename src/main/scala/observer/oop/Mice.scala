package observer.oop

/**
  * Created by starwix on 3.5.16.
  */

case class Mice (
    private var _clickNumber: Int = 0,
    private var _button: Option[Button] = None,
    private var _wheelPressed: Boolean = false
) extends Observable {
  def updateStatus(c: Int, b: Option[Button], w: Boolean) = {
    _clickNumber = c
    _button = b
    _wheelPressed = w
    notify(this)
  }

  def clickNumber: Int = _clickNumber
  def button: Option[Button] = _button
  def wheelPressed: Boolean = _wheelPressed
}

