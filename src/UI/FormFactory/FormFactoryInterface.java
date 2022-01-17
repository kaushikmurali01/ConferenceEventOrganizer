package UI.FormFactory;

import PresenterLayer.GUIPresenterInterface;
import PresenterLayer.UIPresenter;

public interface FormFactoryInterface {
    public void display(String username, String usertype, GUIPresenterInterface guiPresenterInterface);
    public void display(GUIPresenterInterface guiPresenterInterface);
}
