package com.example.profile.screens.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile.R

@Composable
fun InformacaoCard(
    icon: ImageVector? = null,
    titulo: String,
    itens: List<Pair<String, String>>,
    temSeta: Boolean = false
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            icon?.let {
                Icon(
                    imageVector = it,
                    contentDescription = titulo,
                    tint = Color(0xFF5E35B1),
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = titulo,
                fontSize = 13.sp,
                color = Color(0xFF5E35B1),
                modifier = Modifier.weight(1f)
            )

            if (temSeta) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = stringResource(R.string.mais),
                    tint = Color(0xFF5E35B1),
                    modifier = Modifier.size(16.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        Column(modifier = Modifier.padding(start = 28.dp, top = 2.dp)) {
            itens.forEach { (rotulo, valor) ->
                if (rotulo.isNotBlank()) {
                    Text(text = rotulo, fontSize = 10.sp, color = Color.Gray)
                }
                Text(
                    text = valor,
                    fontSize = 14.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(bottom = 6.dp)
                )
            }
        }

        Divider(
            color = Color(0xFFE0E0E0),
            thickness = 1.dp,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}