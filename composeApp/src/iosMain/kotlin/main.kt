import androidx.compose.ui.window.ComposeUIViewController
import org.push.notification.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
