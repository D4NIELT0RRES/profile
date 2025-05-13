package com.example.profile.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile.R
import com.example.profile.screens.components.InformacaoCard
import com.example.profile.screens.components.ProfileButton

@Composable
fun TelaInicial() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
        ) {
            Image(
                painter = painterResource(R.drawable.purple),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.voltar),
                        tint = Color.White
                    )
                    Text(
                        text = stringResource(R.string.titulo_detalhes),
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = 32.dp),
                        maxLines = 1
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Card(
                    shape = CircleShape,
                    modifier = Modifier.size(90.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.osama),
                        contentDescription = stringResource(R.string.foto_perfil),
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = stringResource(R.string.jenny_wilson),
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.sr_ui_ux_designer),
                    fontSize = 12.sp,
                    color = Color.LightGray
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ProfileButton(iconVector = Icons.Default.Email, label = stringResource(R.string.email))
                    ProfileButton(iconVector = Icons.Default.Call, label = stringResource(R.string.ligar))
                    ProfileButton(iconVector = Icons.Default.Email, label = stringResource(R.string.whatsapp))
                    ProfileButton(iconVector = Icons.Default.Star, label = stringResource(R.string.favorito))
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp)) {
            InformacaoCard(
                icon = Icons.Default.Email,
                titulo = stringResource(R.string.titulo_email),
                itens = listOf(
                    stringResource(R.string.oficial) to stringResource(R.string.email_michael_mitc),
                    stringResource(R.string.pessoal) to stringResource(R.string.email_michael)
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            InformacaoCard(
                icon = Icons.Default.Call,
                titulo = stringResource(R.string.numero_telefone),
                itens = listOf(
                    stringResource(R.string.celular) to stringResource(R.string.numero_exemplo)
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            InformacaoCard(
                icon = Icons.Default.AccountBox,
                titulo = stringResource(R.string.equipe),
                itens = listOf("" to stringResource(R.string.nome_equipe)),
                temSeta = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            InformacaoCard(
                icon = Icons.Default.Person,
                titulo = stringResource(R.string.liderado_por),
                itens = listOf("" to stringResource(R.string.nome_lider)),
                temSeta = true
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp),
                shape = RoundedCornerShape(30),
                border = ButtonDefaults.outlinedButtonBorder,
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF5E35B1))
            ) {
                Icon(imageVector = Icons.Default.AccountBox, contentDescription = null)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = stringResource(R.string.adicionar_contato))
            }

            Spacer(modifier = Modifier.width(8.dp))

            IconButton(
                onClick = {},
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp),
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color(0xFF673AB7)
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = stringResource(R.string.compartilhar),
                    tint = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
private fun TelaInicialPreview() {
    TelaInicial()
}