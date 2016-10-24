package org.zapppp;

import org.assertj.swing.annotation.GUITest;
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.Containers;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.runner.GUITestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.MockPolicy;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;

import java.awt.*;

/**
 * Created by zapppp on 24.10.2016.
 */
@GUITest
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(GUITestRunner.class)
@PowerMockIgnore("javax.swing.*")
public class SomePanelTest {

    private Robot robot;

    @Mock
    private SomePanelPresentationModel presentationModel;

    private FrameFixture frameFixture;

    @Before
    public void setUp() {

        SomePanel view = createViewInEdt();
        robot = BasicRobot.robotWithCurrentAwtHierarchy();
        robot.settings().delayBetweenEvents(80);

        frameFixture = Containers.frameFixtureFor(robot, view);
        frameFixture.show(view.getPreferredSize());
    }

    private SomePanel createViewInEdt() {

        return GuiActionRunner.execute(() -> {
            SomePanel somePanel = new SomePanel(presentationModel);
            return somePanel;
        });
    }

    @After
    public void tearDown() {
        frameFixture.cleanUp();
    }

    @Test
    public void testSomething() throws InterruptedException {

        //assert something
    }

    @Test
    public void testOpeningAndClosingDialogsWork() {
        //TODO: add waiting for open and close
    }
}
