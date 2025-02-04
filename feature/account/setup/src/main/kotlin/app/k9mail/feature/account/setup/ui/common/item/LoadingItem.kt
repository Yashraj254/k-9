package app.k9mail.feature.account.setup.ui.common.item

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.k9mail.core.ui.compose.designsystem.molecule.LoadingView

@Composable
internal fun LazyItemScope.LoadingItem(
    modifier: Modifier = Modifier,
    message: String? = null,
) {
    ListItem(
        modifier = modifier,
    ) {
        LoadingView(
            message = message,
        )
    }
}
